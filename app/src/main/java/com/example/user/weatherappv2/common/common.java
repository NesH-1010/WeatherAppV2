package com.example.user.weatherappv2.common;

import android.location.Location;

import java.text.SimpleDateFormat;
import java.util.Date;

public class common {

    public static final String APP_ID = "7237e5c3c3752d9fc90dfb0d867b2427";
    public static Location current_location = null;

    public static String convertUnixToDate(long dt) {
        Date date = new Date(dt*1000L);
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm EEE MM yyyy");
        String formatted = sdf.format(date);
        return formatted;
    }

    public static String convertUnixToHour(long dt) {
        Date date = new Date(dt*1000L);
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        String formatted = sdf.format(date);
        return formatted;
    }
}
