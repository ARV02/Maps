package com.example.maps.utils;

import android.content.Context;

import com.google.android.gms.maps.GoogleMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class Utils {
    public static Coordenadas coordenadas = new Coordenadas();
    public static List<List<HashMap<String, String>>> routes = new ArrayList<>();
    public static void markersDefault(GoogleMap map, Context context){
        new Marcadores(map, context).addMarkersDefault();
    }
}
