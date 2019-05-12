package com.digi.edu.gecw;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;


public class LoginActivity extends AppCompatActivity
{
    Button loginBtn;
    EditText username,password;
    ProgressBar spin;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        loginBtn=findViewById(R.id.login_button);
        username=findViewById(R.id.username_entry);
        password=findViewById(R.id.password_entry);
        spin=findViewById(R.id.loading_login);

        loginBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                loginBtn.setVisibility(View.GONE);
                spin.setVisibility(View.VISIBLE);
            }
        });
    }
}
