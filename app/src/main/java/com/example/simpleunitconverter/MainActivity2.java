package com.example.simpleunitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity2 extends AppCompatActivity {

    private TextInputEditText editText;
    private TextInputEditText editText1;
    private TextView textView3;
    private TextView textView5;
    private Button button2;
    private Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        editText = findViewById(R.id.editText);
        editText1 = findViewById(R.id.editText1);
        textView3 = findViewById(R.id.textView3);
        textView5 = findViewById(R.id.textView5);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);

    }

    public void cm(View v){
        String s = editText.getText().toString();
        Double a = Double.parseDouble(s);
        Double b = a/100;
        textView3.setText(b + " m");

    }

    public void m(View v){

        String s = editText1.getText().toString();
        Double a = Double.parseDouble(s);
        Double b = a*100;
        textView5.setText(b + " cm");
    }

    public void nxt(View v){
        Intent intents = new Intent(this , MainActivity3.class);
        startActivity(intents);
    }


}

