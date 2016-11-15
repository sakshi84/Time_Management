package com.packtpub.timemanagement;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class EventList extends AppCompatActivity implements AdapterView.OnItemClickListener {
    public String[] mGroupList;
    public DrawerLayout mDrawerLayout;
    private ListView mDrawerList;
    public ActionBarDrawerToggle mDrawerToggle;
    public CharSequence mDrawerTitle;
    private CharSequence mTitle;
    Intent i,i1,i2;
    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    RecyclerView.Adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_list);
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
                Toast.makeText(EventList.this,"Drawer closed",Toast.LENGTH_LONG).show();
            }

            @Override
            public void onDrawerOpened(View drawerView) {
                Toast.makeText(EventList.this,"Drawer open",Toast.LENGTH_LONG).show();
            }
        };
        mDrawerLayout.addDrawerListener(mDrawerToggle);
       getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        recyclerView =(RecyclerView) findViewById(R.id.recycler_view_el);

        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        adapter = new Adapter_el();
        recyclerView.setAdapter(adapter);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        // getMenuInflater().inflate(R.menu.menu_card_demo, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
       /* if (id == R.id.action_settings) {
            return true;
        }*/

        return super.onOptionsItemSelected(item);
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
        if(mGroupList[position].equals("Settings")){
            i1 = new Intent(this,Settings.class);
            startActivity(i1);
        }

        if(mGroupList[position].equals("GroupList")){
            i2 = new Intent(this,GroupList.class);
            startActivity(i2);
        }
        Toast.makeText(this,mGroupList[position]+" is selected",Toast.LENGTH_LONG).show();
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




