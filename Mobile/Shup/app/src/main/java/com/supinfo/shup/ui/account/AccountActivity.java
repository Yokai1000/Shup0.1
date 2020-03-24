package com.supinfo.shup.ui.account;

import android.os.Bundle;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.supinfo.shup.R;

public class AccountActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);
        overridePendingTransition(R.anim.trans_right_in, R.anim.trans_right_out);
        ImageButton backHome = findViewById(R.id.back_home);
        backHome.setOnClickListener((v) -> {
            finish();
            overridePendingTransition(R.anim.trans_left_in, R.anim.trans_left_out);
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.trans_left_in, R.anim.trans_left_out);
    }
}
