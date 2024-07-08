package com.example.explicitintent1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText ed1;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


         btn= findViewById(R.id.btn1);

         btn.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 ed1=findViewById(R.id.ed1);
                 String msg=ed1.getText().toString();
                 Intent i =new Intent(MainActivity.this, MainActivity2.class);

                 i.putExtra("message",msg);
                 startActivity(i);
             }
         });
    }
}