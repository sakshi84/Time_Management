package com.packtpub.timemanagement;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Login extends Activity {
     Button btnLogin,btnRegister;
      Intent i1=null,i2=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        btnLogin=(Button)findViewById(R.id.lg_button);
        btnRegister=(Button)findViewById(R.id.rg_button1);
        btnLogin.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        login();
                    }
                });
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                register();
            }
        });

    }
    public void register(){
        i2 = new Intent(this,ContactUs.class);
        startActivity(i2);
    }
    public void login(){
       i1 = new Intent(this,Navigation.class);
       startActivity(i1);
   }
}
