package com.example.unitconvertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    TextView textView1, textView2, valueInFahrenheit, textView4;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView1 = findViewById(R.id.textView1);
        textView2 = findViewById(R.id.textView2);
        valueInFahrenheit = findViewById(R.id.valueOfFahrenheit);
        textView4 = findViewById(R.id.textView4);
        editText = findViewById(R.id.editText);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ConvertCelToFah();
            }
        });
    }

    private void ConvertCelToFah() {

        String value = editText.getText().toString();

        int celsius = Integer.parseInt(value);

        double fahrenheit = (celsius * 9/5) + 32;

        valueInFahrenheit.setText("" + fahrenheit);
    }
}