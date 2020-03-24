package com.supinfo.shup.ui.home;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.supinfo.shup.ui.home.fragment.CartObjectFragment;
import com.supinfo.shup.ui.home.fragment.SalesObjectFragment;
import com.supinfo.shup.ui.home.fragment.ShopObjectFragment;

public class HomeCollectionAdapter extends FragmentStatePagerAdapter {

    HomeCollectionAdapter(FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        Fragment fragment;
        switch (position){
            case 1:
                fragment = new CartObjectFragment();
            break;
            case 2:
                fragment = new SalesObjectFragment();
            break;
            default:
                fragment = new ShopObjectFragment();
            break;
        }
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        String title = "";
        switch (position){
            case 0:
                title = "Shopping";
                break;
            case 1:
                title = "Sales";
                break;
            case 2:
                title = "My Cart";
                break;
        }
        return title;
    }
}