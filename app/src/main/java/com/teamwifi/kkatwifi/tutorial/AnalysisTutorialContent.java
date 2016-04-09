package com.teamwifi.kkatwifi.tutorial;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.teamwifi.kkatwifi.R;

/**
 * Created by kyle on 9/6/15.
 */
public class AnalysisTutorialContent extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(
                R.layout.layout_tutorial_content, container, false);

        TextView title = (TextView) rootView.findViewById(R.id.feature_name);
        TextView content = (TextView) rootView.findViewById(R.id.description);
        ImageView pic = (ImageView) rootView.findViewById(R.id.photo);

        title.setText(getString(R.string.analysis));
        content.setText(getString(R.string.content_analysis));
//        pic.setImageResource(R.drawable.icon);

        return rootView;
    }
}