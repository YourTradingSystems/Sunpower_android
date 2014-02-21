package com.example.SunPower.global;

import android.app.Application;
import android.os.Environment;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * User: Vasja
 * Date: 07.11.13
 * Time: 11:21
 */
public final class SunpowerApp extends Application {
    private Thread.UncaughtExceptionHandler mAndroidDefaultUEH;

    /**
     * Custom UncaughtExceptionHandler. Responsible for printing error description
     * int log file and that delegate handling to default UncaughtExceptionHandler.
     */
    private final Thread.UncaughtExceptionHandler mHandler = new Thread.UncaughtExceptionHandler() {
        @Override
        public final void uncaughtException(final Thread _thread, final Throwable _throwable) {
            try {
                printErrorLogToFile(_throwable, "uncaughtException");
            } finally {
                mAndroidDefaultUEH.uncaughtException(_thread, _throwable);
            }
        }
    };

    /**
     * replaces default UncaughtExceptionHandler with custom
     */
    @Override
    public final void onCreate() {
        super.onCreate();

        mAndroidDefaultUEH = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(mHandler);
    }

    /**
     * converts stack trace to string for writing in file
     * @param _throwable
     * @return
     */
    private final String getStackTraceFromThrowableAsString(final Throwable _throwable) {
        final ByteArrayOutputStream baos = new ByteArrayOutputStream();
        final PrintStream ps = new PrintStream(baos);
        _throwable.printStackTrace(ps);
        ps.close();
        return baos.toString();
    }

    /**
     * generates header with current date, time and some short description
     * @param _description
     * @return
     */
    private final String getHeaderStringWithTimestamp(final String _description) {
        final String pattern = "dd/MM/yyyy-HH:mm:ss:SS";
        final SimpleDateFormat format = new SimpleDateFormat(pattern);
        final String header =
                "---------------------------------------------------------------\n" +
                _description + "\n" +
                format.format(new Date()) + "\n" +
                "---------------------------------------------------------------\n";
        return header;
    }

    private final void printErrorLogToFile(final Throwable _throwable, final String _description) {
        final String stacktrace = getStackTraceFromThrowableAsString(_throwable);
        final String header = getHeaderStringWithTimestamp(_description);

        try {
            final FileOutputStream fos = new FileOutputStream(
                    Environment.getExternalStorageDirectory().getAbsolutePath() + "/sunpower_log.txt", true);
            fos.write(header.getBytes());
            fos.write(stacktrace.getBytes());
            fos.close();
        } catch (final IOException _e) {
            _e.printStackTrace();
        }
    }
}
