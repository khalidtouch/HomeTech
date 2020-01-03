package com.example.hometech;

import android.os.AsyncTask;

public class TaskChooser extends AsyncTask<Void, Void, String> {
    private String mUrl;

    public TaskChooser(String mUrl) {
        super();
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
    }
}//end class
