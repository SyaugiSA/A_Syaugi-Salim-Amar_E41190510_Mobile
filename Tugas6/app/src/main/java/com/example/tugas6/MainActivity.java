package com.example.tugas6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnSend;
    EditText name;

    private String KEY_NAME = "NAMA";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.explintext);
//        button = findViewById(R.id.button);
//        editText = findViewById(R.id.edittext);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String url = editText.getText().toString();
//                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
//                startActivity(intent);
//            }
//        });

        name = (EditText) findViewById(R.id.editnama);
        btnSend = (Button) findViewById(R.id.btnsend);

        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String nama = name.getText().toString();
                    if (nama != ""){
                        Intent i = new Intent(MainActivity.this, SecondActivity.class);
                        i.putExtra(KEY_NAME, nama);
                        startActivity(i);
                    }else {
                        Toast.makeText(getApplication(), "YOU NEED TO FEEL YOUR NAME", Toast.LENGTH_SHORT);
                    }
                } catch (Exception e){
                    e.printStackTrace();
                    Toast.makeText(getApplication(), "ERROR, TRY AGAIN!", Toast.LENGTH_SHORT);
                }
            }
        });
    }
}