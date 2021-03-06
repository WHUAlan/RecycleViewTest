package com.example.broadcastbestpractice;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class LoginActivity extends BaseActivity{
private EditText accountEdit;
private EditText passwordEdit;
private Button loginButton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        accountEdit = (EditText)findViewById(R.id.accountEdit);
        passwordEdit = (EditText)findViewById(R.id.passwordEdit);
        loginButton = (Button)findViewById(R.id.loginButton);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String account = accountEdit.getText().toString();
                String password = passwordEdit.getText().toString();

                if(account.equals("admin") && password.equals("123456")){
                    Intent intent = new Intent(
                            LoginActivity.this,MainActivity.class);
                    startActivity(intent);
                    finish();
//                    销毁登陆界面
                }else {
                    Toast.makeText(LoginActivity.this,"account or password error",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}

