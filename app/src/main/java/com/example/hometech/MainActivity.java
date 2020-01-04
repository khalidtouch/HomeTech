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

import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity implements DataSender{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //register callback
        CheckNetwork network = new CheckNetwork(getApplicationContext());
        network.registerNetworkCallback();

        //check network connection
        if(Variables.isNetworkConnected){
            //internet connected
        } else{
            //not connected
        }

    }

    @Override
    public void sendData(String string) {

    }

    private void updateStatus(){
        String url_rl = url + "status";
        StatusTask task = new StatusTask(url_rl, this);
        task.execute();
    }

        // update button status
    private void updateButtonStatus(String jsonStrings){
        try{
            JSONObject json = new JSONObject(jsonStrings);



        } catch (JSONException e){
            e.printStackTrace();
        }
    }

}// end Activity
