package com.example.unreal_kz.parseloginproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.parse.ParseException;
import com.parse.ParseUser;
import com.parse.SignUpCallback;

public class SingUp extends AppCompatActivity {

    EditText singUpUsername, singUpPassword, singUpEmail;
    Button singUpBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sing_up);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        singUpUsername = (EditText) findViewById(R.id.singUpUserNameET);
        singUpPassword = (EditText) findViewById(R.id.singUpUserPassET);
        singUpEmail = (EditText) findViewById(R.id.singUpUserEmailET);
        singUpBtn = (Button) findViewById(R.id.singUpBtn);
        singUpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ParseUser user = new ParseUser();
                user.setUsername(singUpUsername.getText().toString().trim());
                user.setPassword(singUpPassword.getText().toString().trim());
                user.setEmail(singUpEmail.getText().toString().trim());
                user.signUpInBackground(new SignUpCallback() {
                    @Override
                    public void done(ParseException e) {
                        if(e==null){
                            Toast.makeText(SingUp.this,"You have signed up", Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(SingUp.this, MainActivity.class));
                        }else{
                            Toast.makeText(SingUp.this,"Error!", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }
        });

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

}
