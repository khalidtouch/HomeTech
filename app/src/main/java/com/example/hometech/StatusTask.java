package com.example.hometech;

import android.app.Activity;
import android.os.AsyncTask;

public class StatusTask extends AsyncTask<Void, Void, String> {
    private String mUrl;
    DataSender dataSender;

    public StatusTask(String mUrl, Activity activity) {
        dataSender = (DataSender) activity;
        this.mUrl = mUrl;
    }

    @Override
    protected String doInBackground(Void... voids) {
        String jsonString = JSONHttp.makeHttpRequest(mUrl);
        return jsonString;
    }

    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);
        dataSender.sendData(s);
    }
}//end class
