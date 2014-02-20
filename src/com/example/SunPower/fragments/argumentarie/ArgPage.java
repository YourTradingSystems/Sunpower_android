package com.example.SunPower.fragments.argumentarie;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.example.SunPower.R;

/**
 * Page for ViewPager in Argumentarie section
 * User: ZOG
 * Date: 19.02.14
 * Time: 16:03
 */
public final class ArgPage extends Fragment implements View.OnClickListener {

    private TextView tvTitle_FAP, tvMessage_FAP;
    private Button btnImg_FAP;

    private Activity mActivity;

    //C.O. : title and message on fragment
    private String mTitle, mMess;

    /**
     * creating instances only through factory method
     */
    private ArgPage() {}

    /**
     * factory method
     * @return
     */
    public static final ArgPage create() {
        return new ArgPage();
    }

    /**
     * inflating layout of fragment
     * @param _inflater system provided inflater
     * @param _container activity's layout
     * @param _savedInstanceState
     * @return inflated view
     */
    @Override
    public final View onCreateView(final LayoutInflater _inflater, final ViewGroup _container, final Bundle _savedInstanceState) {
        return _inflater.inflate(R.layout.fragment_arg_page, _container, false);
    }

    @Override
    public final void onActivityCreated(final Bundle _savedInstanceState) {
        super.onActivityCreated(_savedInstanceState);

        mActivity = getActivity();

        findViews();
        setListeners();

        updateInfo();
    }

    private final void findViews() {
        tvTitle_FAP         = (TextView) getView().findViewById(R.id.tvTitle_FAP);
        tvMessage_FAP       = (TextView) getView().findViewById(R.id.tvMessage_FAP);
        btnImg_FAP          = (Button) getView().findViewById(R.id.btnImg_FAP);
    }

    private final void setListeners() {
        btnImg_FAP.setOnClickListener(this);
    }

    @Override
    public final void onClick(final View _view) {
        if (_view == btnImg_FAP) {
            //todo: open picture?
        }
    }

    /**
     * must be setted before adding fragment to activity
     * @param _title
     */
    public final void setTitle(final String _title) {
        mTitle = _title;
    }

    /**
     * must be setted before adding fragment to activity
     * @param _mess
     */
    public final void   setMess(final String _mess) {
        mMess = _mess;
    }

    /**
     * invokes in onActivityCreated()
     */
    private final void updateInfo() {
        if (mTitle != null) tvTitle_FAP.setText(mTitle);
        if (mMess != null) tvMessage_FAP.setText(mMess);
    }
}