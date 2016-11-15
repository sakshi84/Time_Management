package com.packtpub.timemanagement;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Navigation extends ActionBarActivity implements AdapterView.OnItemClickListener {
    public String[] mGroupList;
    public DrawerLayout mDrawerLayout;
    private ListView mDrawerList;
    public ActionBarDrawerToggle mDrawerToggle;
    public CharSequence mDrawerTitle;
    private CharSequence mTitle;
    Intent i,i1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_Layout);
        mGroupList = getResources().getStringArray(R.array.GroupList);
        mDrawerList = (ListView) findViewById(R.id.drawer_List);
        mDrawerList.setAdapter(new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, mGroupList));
        mDrawerList.setOnItemClickListener(this);

        mDrawerToggle=new ActionBarDrawerToggle(this,mDrawerLayout,toolbar,R.string.drawer_open,R.string.drawer_close){
            @Override
            public void onDrawerClosed(View drawerView) {
                Toast.makeText(Navigation.this,"Drawer closed",Toast.LENGTH_LONG).show();
            }

            @Override
            public void onDrawerOpened(View drawerView) {
                Toast.makeText(Navigation.this,"Drawer open",Toast.LENGTH_LONG).show();
            }
        };
        mDrawerLayout.addDrawerListener(mDrawerToggle);
       getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        mDrawerToggle.syncState();
    }

    @Override
    public void onItemClick(AdapterView<?> parent,View view,int position,long id){
      if(mGroupList[position].equals("Notification")){
          i = new Intent(this,Notification.class);
          startActivity(i);
      }
        if(mGroupList[position].equals("EventList")){
            i1 = new Intent(this,EventList.class);
            startActivity(i1);
        }
        Toast.makeText(this,mGroupList[position]+" was selected",Toast.LENGTH_LONG).show();
      selectItem(position);
  }

    public void selectItem(int position) {
      mDrawerList.setItemChecked(position,true);
      //setTitle(mGroupList[position]);
    }
   public void setTitle(String title){
       getSupportActionBar().setTitle(title);
   }
}




