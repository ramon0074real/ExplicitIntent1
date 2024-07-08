package com.example.explicitintent1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tv1=findViewById(R.id.tv1);
        Bundle bd= getIntent().getExtras();
        if (bd !=null) {
            String msg = bd.getString("message");
            tv1.setText(msg);
        }
    }
}