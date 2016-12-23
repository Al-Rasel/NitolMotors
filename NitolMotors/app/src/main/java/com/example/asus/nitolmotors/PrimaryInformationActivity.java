package com.example.asus.nitolmotors;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class PrimaryInformationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primary_infromation);
        TextView textViewLogIn=(TextView)findViewById(R.id.textView_next);
        textViewLogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intentAssessment= new Intent(getApplicationContext(),AssessmentActivity.class);
                startActivity(intentAssessment);
            }
        });
    }
}
