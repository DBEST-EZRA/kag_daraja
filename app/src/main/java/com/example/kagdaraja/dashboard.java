package com.example.kagdaraja;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class dashboard extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    NavigationView navigationView;
    DrawerLayout drawerLayout;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("KAG DARAJA");
        setSupportActionBar(toolbar);

        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar,
                R.string.navigation_drawer_open,R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();

        navigationView = (NavigationView) findViewById(R.id.navigation);
        navigationView.setNavigationItemSelectedListener(this);

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case R.id.nav_home:
                Toast.makeText(this, "Home", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nav_about:
                Intent intent = new Intent(getApplicationContext(), About.class);
                startActivity(intent);
                break;
            case R.id.nav_notes:
                Intent intent7 = new Intent(getApplicationContext(), SplashActivity.class);
                startActivity(intent7);
                break;
            case R.id.nav_library:
                Toast.makeText(this, "Library", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nav_other_apps:
                Intent intent2 = new Intent(getApplicationContext(), Mpesa_pay.class);
                startActivity(intent2);
                break;
            case R.id.nav_feedback:
                Toast.makeText(this, "Feedback", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nav_share:
                Toast.makeText(this, "Share", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nav_rate:
                Toast.makeText(this, "Rate Us", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nav_mf:
                Toast.makeText(this, "Men Fellowship", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nav_wwk:
                Toast.makeText(this, "Women Fellowship", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nav_youths:
                Toast.makeText(this, "Youths", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nav_teens:
                Toast.makeText(this, "Teens", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nav_children:
                Toast.makeText(this, "Children", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nav_support:
                Toast.makeText(this, "Support Us", Toast.LENGTH_SHORT).show();
                break;
        }
        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }
}