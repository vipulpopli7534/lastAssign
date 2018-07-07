package com.example.android.q1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.android.q1.R;

public class Register extends AppCompatActivity {

    Storage s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Button register = findViewById(R.id.register);
        final EditText user = findViewById(R.id.username);
        final EditText pass = findViewById(R.id.password);
        final EditText email = findViewById(R.id.email);
        s = new Storage(getApplicationContext());
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                s.store(user.getText().toString(), pass.getText().toString(), email.getText().toString());
                Toast.makeText(Register.this, "Registration Successful", Toast.LENGTH_LONG).show();
            }

        });
    }
}
