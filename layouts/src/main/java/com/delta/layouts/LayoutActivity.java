package com.delta.layouts;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;

public class LayoutActivity extends AppCompatActivity {

    private Button mButton=null;
    private Button mButton2=null;
    private Button mButton3=null;
    private Button mButton4=null;

    DrawerLayout drawerLayout;
    ActionBarDrawerToggle actionBarDrawerToggle;
    Toolbar toolbar;
    NavigationView navigationView;



    @SuppressLint("ResourceAsColor")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        drawerLayout=findViewById(R.id.drawer);
        navigationView=findViewById(R.id.navigationView);

        actionBarDrawerToggle=new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.open,R.string.close);

        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.setDrawerIndicatorEnabled(true);
        actionBarDrawerToggle.syncState();

        actionBarDrawerToggle.getDrawerArrowDrawable().setColor(getResources().getColor(R.color.black));



        mButton=(Button) findViewById(R.id.b1);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(view.getContext(),LayoutActivity2.class);
                startActivity(i);
            }
        });
        mButton2=(Button) findViewById(R.id.b2);
        mButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2=new Intent(view.getContext(),Layout3.class);
                startActivity(i2);
            }
        });
        mButton3=(Button) findViewById(R.id.b3);
        mButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i3=new Intent(view.getContext(),Layout4.class);
                startActivity(i3);
            }
        });
        mButton4=(Button) findViewById(R.id.b4);
        mButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i4=new Intent(view.getContext(),Layout5.class);
                startActivity(i4);
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.layout, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        if (id == R.id.action_share) {
            return true;
        }
        if (id == R.id.search) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
