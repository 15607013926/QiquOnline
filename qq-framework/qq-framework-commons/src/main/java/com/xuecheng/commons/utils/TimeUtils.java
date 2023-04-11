package com.xuecheng.commons.utils;

public class TimeUtils {

    public static String secondToTime(Double times) {
        if (times < 0) {
            throw new IllegalArgumentException("Seconds must be a positive number!");
        }
        int seconds = times.intValue();
        int hour = seconds / 3600;
        int other = seconds % 3600;
        int minute = other / 60;
        int second = other % 60;
        final StringBuilder sb = new StringBuilder();
        if(hour>0) {
            sb.append(hour);
            sb.append(":");
        }
        if (minute < 10) {
            sb.append("0");
        }
        sb.append(minute);
        sb.append(":");
        if (second < 10) {
            sb.append("0");
        }
        sb.append(second);
        return sb.toString();
    }
}
