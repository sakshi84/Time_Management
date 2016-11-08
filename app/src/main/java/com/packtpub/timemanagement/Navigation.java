package com.packtpub.timemanagement;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.widget.ListView;

public class Navigation extends Activity {
        private String[] mPlanetTitles;
        public DrawerLayout drawerLayout;
        public ListView listview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);
        drawerLayout=(DrawerLayout)findViewById(R.id.drawer_Layout);
        listview=(ListView)findViewById(R.id.drawer_List);

    }
}

