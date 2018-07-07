package com.example.android.q1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.android.q1.R;


public class Login extends AppCompatActivity {

    Storage s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button login = findViewById(R.id.login);
        final EditText user = findViewById(R.id.username);
        final EditText pass= findViewById(R.id.password);
        s = new Storage(getApplicationContext());
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                boolean a = s.check(user.getText().toString(), pass.getText().toString());
                if(a) {
                    Intent intent = new Intent(Login.this, Account.class);
                    intent.putExtra("Username", user.getText().toString());
                    startActivity(intent);
                }
                else
                {

                    Toast.makeText(Login.this, "User does not exist", Toast.LENGTH_LONG).show();

                }
            }
        });
    }
}
