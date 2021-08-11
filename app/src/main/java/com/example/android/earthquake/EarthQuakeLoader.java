package com.example.android.earthquake;

import android.content.Context;

import androidx.loader.content.AsyncTaskLoader;

import java.util.List;

public class EarthQuakeLoader extends AsyncTaskLoader<List<Word>> {
    /** Tag for log messages */
    private static final String LOG_TAG = EarthQuakeLoader.class.getName();

    /** Query URL */
    private String mUrl;
    public EarthQuakeLoader(Context context,String url) {
        super(context);
        mUrl = url;
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    /**
     * This is on a background thread.
     */
    @Override
    public List<Word> loadInBackground() {
        if (mUrl == null) {
            return null;
        }

        // Perform the network request, parse the response, and extract a list of earthquakes.
        List<Word> earthquakes = QueryUtils.fetchEarthquakeData(mUrl);
        return earthquakes;
    }

}

