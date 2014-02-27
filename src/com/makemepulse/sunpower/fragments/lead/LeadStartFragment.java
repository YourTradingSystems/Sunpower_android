package com.makemepulse.sunpower.fragments.lead;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.makemepulse.sunpower.R;

/**
 * User: ZOG
 * Date: 27.02.14
 * Time: 12:26
 */
public class LeadStartFragment extends Fragment {

    private TextView tvWelcome_FLS;

    private Activity mActivity;

    /**
     * Creating instance only through factory method.
     */
    private LeadStartFragment() {}

    /**
     * Factory method.
     * @return new instance
     */
    public static final LeadStartFragment create() {
        return new LeadStartFragment();
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
        return _inflater.inflate(R.layout.fragment_lead_start, _container, false);
    }

    @Override
    public final void onActivityCreated(final Bundle _savedInstanceState) {
        super.onActivityCreated(_savedInstanceState);

        mActivity = getActivity();

        findViews();

        setWelcomeText(mActivity, tvWelcome_FLS, "Jean-Michel Dupont");
    }

    private final void findViews() {
        tvWelcome_FLS       = (TextView) getView().findViewById(R.id.tvWelcome_FLS);
    }

    /**
     * Set welcome text in format: "Bonjour user".
     * @param _name
     */
    private final void setWelcomeText(final Context _context, final TextView _tvWelcome_FLS, final String _name) {
        _tvWelcome_FLS.setText(_context.getString(R.string.welcome) + " " + _name);
    }
}
