package com.example.loginapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText usernameEditText,passwordEditText;
    private Button loginButton;
    private TextView textView;

    private int counter = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usernameEditText = findViewById(R.id.username_Id);
        passwordEditText = findViewById(R.id.password_Id);
        loginButton = findViewById(R.id.button_Id);
        textView = findViewById(R.id.textViewId);

        textView.setText("Number of attempts remaining : 3");

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String username = usernameEditText.getText().toString();
                String password = passwordEditText.getText().toString();


                if (username.equals("admin") && password.equals("1234")){

                    Intent intent = new Intent(MainActivity.this,Second_Activity.class);
                    startActivity(intent);
                }
                else {
                    counter--;
                    textView.setText("Number of attempts remaining : "+counter);

                    if (counter==0){


                    }

                }


            }
        });


    }
}