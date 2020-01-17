package com.example.medidor_de_bateria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;
import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private BAtteryBroadcastReceiver mBatteryReceiver = new BAtteryBroadcastReceiver();
    private IntentFilter mIntentFilter = new IntentFilter(Intent.ACTION_BATTERY_CHANGED);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    protected void onResume() {
        super.onResume();
        registerReceiver(mBatteryReceiver, mIntentFilter);
    }

    @Override
    protected void onPause() {
        unregisterReceiver(mBatteryReceiver);
        super.onPause();
    }
    }
