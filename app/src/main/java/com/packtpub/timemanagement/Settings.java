package com.packtpub.timemanagement;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Settings extends AppCompatActivity {
     Button btnContactUs,btnAboutUs,btnProfile;
     Intent i,i1,i2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.setting);
        btnContactUs=(Button)findViewById(R.id.contactUs);
        btnAboutUs=(Button)findViewById(R.id.aboutUs);
        btnProfile=(Button)findViewById(R.id.profile);
        btnProfile.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        profile();
                    }
                });
        btnContactUs.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        contactUs();
                    }
                });
        btnAboutUs.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        aboutUs();
                    }
                });
    }
  public void contactUs(){
      i = new Intent(this,ContactUs.class);
      startActivity(i);
  }
    public void aboutUs(){
        i1 = new Intent(this,AboutUs.class);
        startActivity(i1);
    }
    public void profile(){
        i2 = new Intent(this,UserProfile.class);
        startActivity(i2);
    }
}
