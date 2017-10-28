package com.srit.adc.wicc2018;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by anupamchugh on 10/12/15.
 */
public class OrganizationFragment extends Fragment implements View.OnClickListener {
    TextView snr_textView,srit_textView,cse_extView,cbe_textView;

    public OrganizationFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.organization, container, false);
        snr_textView =  rootView.findViewById(R.id.snr);
        snr_textView.setOnClickListener(this);
        srit_textView =  rootView.findViewById(R.id.srit);
        srit_textView.setOnClickListener(this);
        cse_extView =  rootView.findViewById(R.id.cse);
        cse_extView.setOnClickListener(this);
        cbe_textView =  rootView.findViewById(R.id.cbe);
        cbe_textView.setOnClickListener(this);

        return rootView;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.snr:
                String url = "http://www.snrsonscharitabletrust.org/";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
               break;
            case R.id.srit:
                 url = "http://srit.org/";
                 i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
                break;
            case R.id.cse:
                 url = "http://kulam.in/";
                 i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
                break;
            case R.id.cbe:
                 url = "http://www.csi-india.org/";
                 i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
                break;
        }

    }
}
