package com.monstertechno.loginuidesign1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class LogIn_Activity extends AppCompatActivity{

    TextView text_forgot,text_social;
    ImageView imageLogo, plus,facebook,twitter;
    Button signin,signup;
    EditText username,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(1);
        getWindow().setFlags(1024, 1024);
        setContentView(R.layout.activity_login);

        text_forgot = (TextView) findViewById(R.id.text_forgot);
        text_social = (TextView) findViewById(R.id.social_signIN);

        imageLogo = (ImageView) findViewById(R.id.imageView);
        plus = (ImageView) findViewById(R.id.plus);
        facebook = (ImageView) findViewById(R.id.facebook);
        twitter = (ImageView) findViewById(R.id.twitter);

        signin = (Button) findViewById(R.id.signin);
        signup = (Button) findViewById(R.id.signup);

        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);


    }


}