package com.example.nguyenletai_btvnbuoi5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Login extends AppCompatActivity implements iLogin {
    LoginPresenter loginPresenter;
    Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        btnLogin = findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
           @Override
       public void onClick(View v) {
        loginPresenter.setonClick();
            }
        });
    }

    @Override
    public void clickLogin(Class mess) {
            Intent intent = new Intent(getBaseContext(), Order.class);
            startActivity(intent);
    }

}