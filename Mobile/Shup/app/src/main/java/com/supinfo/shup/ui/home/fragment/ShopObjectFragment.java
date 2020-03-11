package com.supinfo.shup.ui.home.fragment;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.google.android.material.tabs.TabLayout;
import com.supinfo.shup.R;

import org.w3c.dom.Text;

public class ShopObjectFragment extends Fragment {
    private TextView textView;
    public static final String ARG_OBJECT = "object";

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_collection_shop, container, false);
        textView = view.findViewById(R.id.textView);
        textView.setText("Vue fragment Shop");
        return view;
    }
}
