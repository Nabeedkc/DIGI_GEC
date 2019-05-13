package com.digi.edu.gecw;


import android.graphics.Typeface;
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
    Typeface fontstyle;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        fontstyle =Typeface.createFromAsset(getAssets(),  "fonts/font.ttf");
        setContentView(R.layout.activity_login);
        loginBtn=findViewById(R.id.login_button);
        username=findViewById(R.id.username_entry);
        password=findViewById(R.id.password_entry);
        //spin=findViewById(R.id.loading_login);
        username.setTypeface(fontstyle);

        loginBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(username.getText().toString().matches(""))
                {
                    username.setHintTextColor(getResources().getColor(R.color.Red));
                    username.setHint("Invalid Username");
                }
                else
                {
                    username.setHint("Not null");
                }
                if(password.getText().toString().matches(""))
                {
                    password.setHintTextColor(getResources().getColor(R.color.Red));
                    password.setHint("Invalid Password");
                }
                else
                {
                    password.setHint("Not null");
                }
                //loginBtn.setVisibility(View.GONE);
                //spin.setVisibility(View.VISIBLE);
            }
        });
    }
}
