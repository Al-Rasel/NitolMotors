package com.example.asus.nitolmotors.spinner;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.asus.nitolmotors.AssessmentActivity;
import com.example.asus.nitolmotors.R;


public class Yes_No_Dialog extends android.app.DialogFragment {


    int trackId;


    public Yes_No_Dialog() {
        // Required empty public constructor
    }

    public static Yes_No_Dialog newInstance(int id) {
        Yes_No_Dialog fragment = new Yes_No_Dialog();
        fragment.trackId = id;
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_yes_no, container, false);
        TextView textViewYes = (TextView) view.findViewById(R.id.tv_yes);
        TextView textViewNo = (TextView) view.findViewById(R.id.tv_no);
        textViewYes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (trackId == 1) {
                    AssessmentActivity.textViewOne.setText("Yes");

                } else if (trackId == 2) {
                    AssessmentActivity.textViewTwo.setText("Yes");
                } else if (trackId == 3) {
                    AssessmentActivity.textViewThree.setText("Yes");
                } else if (trackId == 4) {
                    AssessmentActivity.textViewFour.setText("Yes");
                } else if (trackId == 5) {
                    AssessmentActivity.textViewFive.setText("Yes");
                } else if (trackId == 6) {
                    AssessmentActivity.textViewSix.setText("Yes");
                }
                dismiss();

            }
        });
        textViewNo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (trackId == 1) {
                    AssessmentActivity.textViewOne.setText("No");

                } else if (trackId == 2) {
                    AssessmentActivity.textViewTwo.setText("No");
                } else if (trackId == 3) {
                    AssessmentActivity.textViewThree.setText("No");
                } else if (trackId == 4) {
                    AssessmentActivity.textViewFour.setText("No");
                } else if (trackId == 5) {
                    AssessmentActivity.textViewFive.setText("No");
                } else if (trackId == 6) {
                    AssessmentActivity.textViewSix.setText("No");
                }
                dismiss();
            }
        });
        return view;
    }

}


