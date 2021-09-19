package com.company;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class StopWatch {
    private String startTime;
    private String endTime;

    StopWatch(){
        String timeStamp = new SimpleDateFormat("yyyy:MM:dd_HH:mm:ss").format(Calendar.getInstance().getTime());
        this.startTime = timeStamp;
    }
    public void start(){
        String timeStamp = new SimpleDateFormat("yyyy:MM:dd_HH:mm:ss").format(Calendar.getInstance().getTime());
        this.startTime = timeStamp;
    }
    public void stop() {
        String timeStamp = new SimpleDateFormat("yyyy:MM:dd_HH:mm:ss").format(Calendar.getInstance().getTime());
        this.endTime = timeStamp;
    }
    public String getElapsedTime(){
        String timeStamp = new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime());
        return timeStamp;
    }
    public String getStartTime() {
        return startTime;
    }

    public String getEndTime() {
        return endTime;
    }
}
