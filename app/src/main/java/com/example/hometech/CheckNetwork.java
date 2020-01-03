package com.example.hometech;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkRequest;

import androidx.annotation.NonNull;

public class CheckNetwork {
    private boolean isNetworkAvailable(){
        ConnectivityManager connectivityManager;
        NetworkRequest.Builder builder;

        try{
            connectivityManager
                    = (ConnectivityManager) getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
            builder = new NetworkRequest.Builder();

            connectivityManager.registerNetworkCallback(builder.build(),
                    new ConnectivityManager.NetworkCallback(){
                        @Override
                        public void onAvailable(@NonNull Network network) {
                            //Variables.isNetworkConnected = true; GLOBAL STATIC VARIABLE
                        }

                        @Override
                        public void onLost(@NonNull Network network) {
                            //Variables.isNetworkConnected = false; //
                        }
                    });
            // Variables.isNetworkConnected = false;
        } catch (Exception e){
            // Variables.isNetworkConnected = false;
        }
    }
}//end class
