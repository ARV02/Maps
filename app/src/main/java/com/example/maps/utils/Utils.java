package com.example.maps.utils;

import android.content.Context;

import com.google.android.gms.maps.GoogleMap;



public class Utils {
    public static Coordenadas coordenadas = new Coordenadas();
    public static void markersDefault(GoogleMap map, Context context){
        new Marcadores(map, context).addMarkersDefault();
    }
}
