package com.example.etjsc.tue;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private Spinner spinner;
    private EditText result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result = (EditText)findViewById(R.id.result);
        spinner = (Spinner)findViewById(R.id.spinner);
        button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Spinner1 = spinner.getSelectedItem().toString();
                result.setText(Spinner1);
            }
        });
    }
}
