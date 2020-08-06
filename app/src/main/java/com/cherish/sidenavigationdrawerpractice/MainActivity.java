package com.cherish.sidenavigationdrawerpractice;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    ActionBarDrawerToggle actionBarDrawerToggle;
    Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        drawerLayout = findViewById(R.id.drawer);
        toolbar = findViewById(R.id.toolBar);
       setSupportActionBar(toolbar);
        navigationView = findViewById(R.id.navigationDrawer);
        actionBarDrawerToggle = new ActionBarDrawerToggle(this,drawerLayout, toolbar, R.string.open,R.string.close);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
//        actionBarDrawerToggle.syncState();
               toolbar.setNavigationIcon(R.drawable.ic_vector);
//
//              toolbar.setContentInsetsRelative(0,0);
//        toolbar.setContentInsetsAbsolute(0,0);
//        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
//        getSupportActionBar().setCustomView(R.layout.custom_toolbar);

//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//        getSupportActionBar().setHomeButtonEnabled(true);



    }
}
