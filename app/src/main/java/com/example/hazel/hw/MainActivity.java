package com.example.hazel.hw;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int size=8;
    private EditText id;
    private EditText name;
    private EditText email;

    private Button send;
    private TextView printont;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findviews();
    }
    private void findviews() {
        id = findViewById(R.id.editText5);
        name = findViewById(R.id.editText4);
        email = findViewById(R.id.editText6);

        send=findViewById(R.id.button2);

        printont =findViewById(R.id.textView2);
    }
    public void printresult(View v){
        String i=id.getText().toString();
        String n =id.getText().toString();
        String e =id.getText().toString();
        printont.setTextSize(size);
        printont.setText(i+n+e);


    }
}

