package com.example.asus.nitolmotors;

import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.asus.nitolmotors.spinner.Yes_No_Dialog;

public class AssessmentActivity extends AppCompatActivity {

    public static TextView textViewOne;
    public static TextView textViewTwo;
    public static TextView textViewThree;
    public static TextView textViewFour;
    public static TextView textViewFive;
    public static TextView textViewSix;
    RelativeLayout spinnerOne;
    RelativeLayout spinnerTwo;
    RelativeLayout spinnerThree;
    RelativeLayout spinnerFour;
    RelativeLayout spinnerFive;
    RelativeLayout spinnerSix;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assessment);


        spinnerOne = (RelativeLayout) findViewById(R.id.spinner_first);

        spinnerTwo = (RelativeLayout) findViewById(R.id.spinner_second);
        spinnerThree = (RelativeLayout) findViewById(R.id.spinner_third);
        spinnerFour = (RelativeLayout) findViewById(R.id.spinner_four);
        spinnerFive = (RelativeLayout) findViewById(R.id.spinner_five);
        spinnerSix = (RelativeLayout) findViewById(R.id.spinner_six);

        textViewOne = (TextView) findViewById(R.id.text_first);
        textViewTwo = (TextView) findViewById(R.id.text_second);
        textViewThree = (TextView) findViewById(R.id.text_third);
        textViewFour = (TextView) findViewById(R.id.text_four);
        textViewFive = (TextView) findViewById(R.id.text_five);
        textViewSix = (TextView) findViewById(R.id.text_six);

        TextView textViewLogIn = (TextView) findViewById(R.id.textView_report);
        textViewLogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intentReport = new Intent(getApplicationContext(), ReportActivity.class);
                startActivity(intentReport);
            }
        });

        spinnerOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction ft =getFragmentManager().beginTransaction();
                Yes_No_Dialog fm = Yes_No_Dialog.newInstance(1);
                fm.show(ft, "Yes_No");
            }
        });
        spinnerTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction ft =getFragmentManager().beginTransaction();
                Yes_No_Dialog fm = Yes_No_Dialog.newInstance(2);
                fm.show(ft, "Yes_No");
            }
        });
        spinnerThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction ft =getFragmentManager().beginTransaction();
                Yes_No_Dialog fm = Yes_No_Dialog.newInstance(3);
                fm.show(ft, "Yes_No");
            }
        });
        spinnerFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction ft =getFragmentManager().beginTransaction();
                Yes_No_Dialog fm = Yes_No_Dialog.newInstance(4);
                fm.show(ft, "Yes_No");
            }
        });
        spinnerFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction ft =getFragmentManager().beginTransaction();
                Yes_No_Dialog fm = Yes_No_Dialog.newInstance(5);
                fm.show(ft, "Yes_No");
            }
        });
        spinnerSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction ft =getFragmentManager().beginTransaction();
                Yes_No_Dialog fm = Yes_No_Dialog.newInstance(6);
                fm.show(ft, "Yes_No");
            }
        });






    }
}
