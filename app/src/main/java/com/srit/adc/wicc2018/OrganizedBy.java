package com.srit.adc.wicc2018;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by CHOCOLATE on 08-Oct-17.
 */

public class OrganizedBy extends android.support.v4.app.Fragment {

    public OrganizedBy() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.organizedby_fragment, container, false);

        return rootView;
    }
}
