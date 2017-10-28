package com.srit.adc.wicc2018;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import static com.srit.adc.wicc2018.R.id.button2;
import static com.srit.adc.wicc2018.R.id.button3;
import static com.srit.adc.wicc2018.R.id.button4;
import static com.srit.adc.wicc2018.R.id.button5;
import static com.srit.adc.wicc2018.R.id.button6;
import static com.srit.adc.wicc2018.R.id.button7;
import static com.srit.adc.wicc2018.R.id.button8;
import static com.srit.adc.wicc2018.R.id.button9;

/**
 * Created by CHOCOLATE on 08-Oct-17.
 */

public class Themes extends android.support.v4.app.Fragment implements View.OnClickListener {
    Button b[]=new Button[9];
    public Themes() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.themes_fragment, container, false);
        b[0]=rootView.findViewById(R.id.button1);
        b[1]=rootView.findViewById(button2);
        b[2]=rootView.findViewById(button3);
        b[3]=rootView.findViewById(button4);
        b[4]=rootView.findViewById(button5);
        b[5]=rootView.findViewById(button6);
        b[6]=rootView.findViewById(button7);
        b[7]=rootView.findViewById(button8);
        b[8]=rootView.findViewById(button9);
        for(int i=0;i<9;i++){
            b[i].setOnClickListener(this);
        }
        return rootView;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
             //myIntent;
            case R.id.button1:
                Intent myIntent = new Intent(getActivity(), ClusterCommputingTest.class);
                startActivity(myIntent);
                break;
            case R.id.button2:
                myIntent = new Intent(getActivity(), MachineLearningTest.class);
                startActivity(myIntent);
                break;
            case R.id.button3:
                myIntent = new Intent(getActivity(), SMACTest.class);
                startActivity(myIntent);
                break;
            case R.id.button4:
                myIntent = new Intent(getActivity(), IoTTest.class);
                startActivity(myIntent);
                break;
            case R.id.button5:
                myIntent = new Intent(getActivity(), AITest.class);
                startActivity(myIntent);
                break;
            case R.id.button6:
               myIntent = new Intent(getActivity(), CyberSecurityTest.class);
                startActivity(myIntent);
                break;
            case R.id.button9:
                myIntent = new Intent(getActivity(), ICTTest.class);
                startActivity(myIntent);
                break;
            case button8:
                myIntent = new Intent(getActivity(), UbiquitousComputingTest.class);
                startActivity(myIntent);
                break;
            case R.id.button7:
                myIntent = new Intent(getActivity(), WebStandardsTest.class);
                startActivity(myIntent);
                break;
            default:
                break;

        }

    }
}
