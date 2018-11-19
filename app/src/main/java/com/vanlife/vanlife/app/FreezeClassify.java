package com.vanlife.vanlife.app;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FreezeClassify extends Fragment {
    private static final String TAG = "FreezeClassify";


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.freeze_fragment,container,false);


        Log.d(TAG, "onCreateView:");

        return view;
    }
    //creating new fragment
    public static Camera2Fragment newInstance(){
        return new Camera2Fragment();
    }
}
