package com.packtpub.timemanagement;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AddGroup extends AppCompatActivity {
    Button createGroup;
    Intent i2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_group);
        createGroup=(Button)findViewById(R.id.createGroup);
        createGroup.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        createGroup();

                    }
                });
    }
 public void createGroup(){
      i2 = new Intent(this,CreateGroup.class);
      startActivity(i2);
      }
}
