package com.srit.adc.wicc2018;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by anupamchugh on 10/12/15.
 */
public class AdvisoryCommittee extends Fragment {

    public AdvisoryCommittee() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.advisory_committee, container, false);

        return rootView;
    }

}
