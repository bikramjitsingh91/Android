package com.example.bsvic.calapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText t1,t2;
    Button btn;
    TextView ans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t1 = (EditText)findViewById(R.id.et1);
        t2 = (EditText)findViewById(R.id.et2);

        btn  = (Button)findViewById(R.id.button);
        ans = (TextView)findViewById(R.id.res);

        btn.setOnClickListener(v -> {
            int i = Integer.parseInt(t1.getText().toString());
            int j = Integer.parseInt(t2.getText().toString());

            ans.setText("Ans is " + (i + j));
        });
    }
}
