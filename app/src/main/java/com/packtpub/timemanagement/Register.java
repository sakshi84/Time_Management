package com.packtpub.timemanagement;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Register extends Activity {
    Intent i2;
    Button btnRegister;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        btnRegister=(Button)findViewById(R.id.rg_button);
        btnRegister.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        register();

                    }
                });

    }
    public void register(){
        i2 = new Intent(this,Login.class);
        startActivity(i2);
    }
}
