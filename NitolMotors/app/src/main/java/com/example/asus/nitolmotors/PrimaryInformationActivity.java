package com.example.asus.nitolmotors;

import android.app.FragmentTransaction;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.asus.nitolmotors.spinner.MaterialDialogModelFragment;

public class PrimaryInformationActivity extends AppCompatActivity {

  public static   TextView textViewModels;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primary_infromation);
        TextView textViewLogIn=(TextView)findViewById(R.id.textView_next);
        RelativeLayout relativeLayout=(RelativeLayout)findViewById(R.id.layout_models);

        textViewModels= (TextView)findViewById(R.id.text_model);







        textViewLogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intentAssessment= new Intent(getApplicationContext(),AssessmentActivity.class);
                startActivity(intentAssessment);
            }
        });
        relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction ft =getFragmentManager().beginTransaction();
                MaterialDialogModelFragment fm = MaterialDialogModelFragment.newInstance(true);
                fm.show(ft, "SelectModel");
            }
        });
    }








}
