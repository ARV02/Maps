package com.example.maps.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

import com.example.maps.R;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class Marcadores {
    GoogleMap map;
    Context context;

    public Marcadores(GoogleMap map, Context context) {
        this.map = map;
        this.context = context;
    }

    public void addMarkersDefault(){

    }

    public void uno(Double latitude, Double length, String title){
        LatLng point = new LatLng(latitude, length);
        int height = 140;
        int width = 165;
        BitmapDrawable uno = (BitmapDrawable)context.getResources().getDrawable(R.drawable.ic_gps);
        Bitmap unos = uno.getBitmap();
        Bitmap uns = Bitmap.createScaledBitmap(unos, width, height, false);
        map.addMarker(new MarkerOptions()
        .position(point)
        .title(title).snippet("uno")
        .icon(BitmapDescriptorFactory.fromBitmap(uns)));
    }
}
