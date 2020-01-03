package com.example.hometech;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkRequest;
import android.net.wifi.p2p.WifiP2pManager;
import android.os.Build;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements DataSender{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void sendData(String string) {

    }


}// end Activity
