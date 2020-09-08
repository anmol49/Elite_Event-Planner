package com.example.eliteeventplanner;

import android.app.ActionBar;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.navigation.NavigationView;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{
    DrawerLayout drawerLayout;
    ActionBarDrawerToggle Toggle;
    Toolbar toolbar;
    NavigationView navigationView;
    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;
    TabLayout tabLayout;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

        public void initView(){

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        drawerLayout = findViewById(R.id.drawer);
        navigationView = findViewById(R.id.navigation_view);
        navigationView.setNavigationItemSelectedListener(this);

        Toggle = new ActionBarDrawerToggle(this, drawerLayout,toolbar,R.string.open, R.string.close);
        drawerLayout.addDrawerListener(Toggle);
        Toggle.setDrawerIndicatorEnabled(true);
        Toggle.syncState();

        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.container_fragment, new HomeFragment());
        fragmentTransaction.commit();


    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        drawerLayout.closeDrawer(GravityCompat.START);
        if (item.getItemId() == R.id.home) {
            fragmentManager = getSupportFragmentManager();
            fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.container_fragment, new HomeFragment(), null).addToBackStack(null);
            fragmentTransaction.commit();
            Toast.makeText(MainActivity.this, "Home", Toast.LENGTH_SHORT).show();

        }
        if (item.getItemId() == R.id.theme) {
            fragmentManager = getSupportFragmentManager();
            fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.container_fragment, new ThemeFragment(), null).addToBackStack(null);
            fragmentTransaction.commit();
            Toast.makeText(MainActivity.this, "Theme", Toast.LENGTH_SHORT).show();
        }
        if (item.getItemId() == R.id.venue) {
            fragmentManager = getSupportFragmentManager();
            fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.container_fragment, new VenueFragment(), null).addToBackStack(null);
            fragmentTransaction.commit();
            Toast.makeText(MainActivity.this, "Venue", Toast.LENGTH_SHORT).show();
            }
        if (item.getItemId() == R.id.bookevent) {
            //fragmentManager = getSupportFragmentManager();
            //fragmentTransaction = fragmentManager.beginTransaction();
            //fragmentTransaction.replace(R.id.container_fragment, new BookFragment(), null).addToBackStack(null);
            //fragmentTransaction.commit();
            startActivity(new Intent(MainActivity.this,Booking.class));
            Toast.makeText(MainActivity.this, "BookEvent", Toast.LENGTH_SHORT).show();
        }
        if (item.getItemId() == R.id.mail) {
            fragmentManager = getSupportFragmentManager();
            fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.container_fragment, new MailFragment(), null).addToBackStack(null);
            fragmentTransaction.commit();
        }

        return true;
    }
}

