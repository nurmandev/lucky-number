package com.nurmandev.luckynumber;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {


    EditText editText;
    Button button;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

    editText = findViewById(R.id.user_name);
    textView = findViewById(R.id.lucky);
    button = findViewById(R.id.openBrowser);

    button.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

        }
    });

    }

}