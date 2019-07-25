package com.mobotechnology.bipinpandey.mvp_hand_dirty.main_activity.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.mobotechnology.bipinpandey.mvp_hand_dirty.R;

public class NotMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_not_main);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
