package com.example.tugas1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    EditText Pada, Subject, Pesan;
    Button Submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard);

        Pada = findViewById(R.id.pada);
        Pesan = findViewById(R.id.pesan);
        Subject = findViewById(R.id.subject);
        Submit = findViewById(R.id.submit);
    }
}