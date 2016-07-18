package com.android.sunshine;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {



    public MainActivityFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        String[] forecastArray = {
                "Today  - Sunny - 29/22",
                "Tomorrow  - Foggy - 21/81",
                "Monday  - Cloudy - 22/00",
                "Thursday  - Rainy - 88/86",



        };
        ArrayList<String> forecastArrayList = new ArrayList<String>(Arrays.asList(forecastArray));
        ArrayAdapter<String> forecastArrayAdapter = new ArrayAdapter<String>(getActivity(),
                R.layout.fragment_main, R.id.listview_forecast, forecastArrayList);

        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        ListView lv =  (ListView) rootView.findViewById(R.id.listview_forecast);
        lv.setAdapter(forecastArrayAdapter);

        return rootView;


    }
}
