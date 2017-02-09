package com.example.android.quizapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int score = 0;
    int selectedId = 0;
    Button submitBtn;
    RadioGroup ques1, ques2, ques3, ques4, ques5, ques6, ques8, ques9;
    EditText ques10;
    CheckBox ques7a, ques7b, ques7c, ques7d, ques7e, ques7f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initalisation();

        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedId = ques1.getCheckedRadioButtonId();
                if (selectedId == R.id.ques1b) score = score + 1;
                selectedId = ques2.getCheckedRadioButtonId();
                if (selectedId == R.id.ques2b) score = score + 1;
                selectedId = ques3.getCheckedRadioButtonId();
                if (selectedId == R.id.ques3a) score = score + 1;
                selectedId = ques4.getCheckedRadioButtonId();
                if (selectedId == R.id.ques4a) score = score + 1;
                selectedId = ques5.getCheckedRadioButtonId();
                if (selectedId == R.id.ques5a) score = score + 1;
                selectedId = ques6.getCheckedRadioButtonId();
                if (selectedId == R.id.ques6d) score = score + 1;
                selectedId = ques8.getCheckedRadioButtonId();
                if (selectedId == R.id.ques8a) score = score + 1;
                selectedId = ques9.getCheckedRadioButtonId();
                if (selectedId == R.id.ques9a) score = score + 1;
                if (ques7c.isChecked() || ques7d.isChecked() || ques7f.isChecked())
                    score = score + 1;
                String answer = ques10.getText().toString().toLowerCase();
                if (answer.matches("intellectual")) score = score + 1;
                Toast.makeText(MainActivity.this, "Your Score is " + score, Toast.LENGTH_SHORT).show();
                score = 0;
            }
        });
    }

    public void initalisation() {
        submitBtn = (Button) findViewById(R.id.submitBtn);
        ques1 = (RadioGroup) findViewById(R.id.ques1);
        ques2 = (RadioGroup) findViewById(R.id.ques2);
        ques3 = (RadioGroup) findViewById(R.id.ques3);
        ques4 = (RadioGroup) findViewById(R.id.ques4);
        ques5 = (RadioGroup) findViewById(R.id.ques5);
        ques6 = (RadioGroup) findViewById(R.id.ques6);
        ques8 = (RadioGroup) findViewById(R.id.ques8);
        ques9 = (RadioGroup) findViewById(R.id.ques9);
        ques7a = (CheckBox) findViewById(R.id.ques7a);
        ques7b = (CheckBox) findViewById(R.id.ques7b);
        ques7c = (CheckBox) findViewById(R.id.ques7c);
        ques7d = (CheckBox) findViewById(R.id.ques7d);
        ques7e = (CheckBox) findViewById(R.id.ques7e);
        ques7f = (CheckBox) findViewById(R.id.ques7f);
        ques10 = (EditText) findViewById(R.id.ques10);
    }
}
