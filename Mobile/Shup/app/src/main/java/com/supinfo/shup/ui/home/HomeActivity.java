package com.supinfo.shup.ui.home;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager2.widget.ViewPager2;

import com.supinfo.shup.R;

public class HomeActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        HomeCollectionAdapter homeCollectionAdapter = new HomeCollectionAdapter(getSupportFragmentManager());
        ViewPager2 viewPager = findViewById(R.id.pager);
        viewPager.setAdapter(homeCollectionAdapter);
    }
}
