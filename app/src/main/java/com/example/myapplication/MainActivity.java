package com.example.myapplication;

import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.jar.Attributes;

public class MainActivity extends AppCompatActivity {

    //Class variables are also called fields
    private TextView resultText;
    private Button calculatebutton;
    private RadioButton malebutton;
    private RadioButton femalebutton;
    private EditText ageedittext;
    private EditText feetedittext;
    private EditText inchesedittext;
    private EditText weightedittext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
findViews();


        setupbuttonclicklistner();

    }

    private void setupbuttonclicklistner() {
        calculatebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this, "wow we can react to button clicks", Toast.LENGTH_LONG).show();


    }
        });
    }

    private void findViews (){
        resultText = findViewById(R.id.text_view_result);

        malebutton = findViewById(R.id.radio_button_male);
        femalebutton = findViewById(R.id.radio_button_female);

        ageedittext = findViewById(R.id.edit_text_age);
        feetedittext = findViewById(R.id.edit_text_feet);
        inchesedittext = findViewById(R.id.edit_text_inches);
        weightedittext = findViewById(R.id.edit_text_weight);


         calculatebutton = findViewById(R.id.button_calculate);

    }
}