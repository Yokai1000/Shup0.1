package com.supinfo.shup.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;
import com.supinfo.shup.R;
import com.supinfo.shup.ui.account.AccountActivity;
import com.supinfo.shup.ui.login.LoginActivity;
import com.supinfo.shup.ui.settings.SettingsActivity;

public class HomeActivity extends AppCompatActivity {

   @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        setViewPager();
        setButtons();
   }

   private void setButtons(){
       ImageButton goAccount = findViewById(R.id.go_account);
       goAccount.setOnClickListener( (v) -> {
               startActivity(new Intent(HomeActivity.this, AccountActivity.class));

       });
       ImageButton goSettings = findViewById(R.id.go_settings);
       goSettings.setOnClickListener( (v) -> {
           startActivity(new Intent(HomeActivity.this, SettingsActivity.class));

       });
   }

    private void setViewPager() {
        HomeCollectionAdapter homeCollectionAdapter = new HomeCollectionAdapter(getSupportFragmentManager());
        TabLayout tabLayout = findViewById(R.id.tab_layout);
        ViewPager viewPager = findViewById(R.id.pager);
        tabLayout.setupWithViewPager(viewPager);
        viewPager.setAdapter(homeCollectionAdapter);
    }
}
