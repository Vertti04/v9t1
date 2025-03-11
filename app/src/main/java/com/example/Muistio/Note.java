package com.example.Muistio;

import java.util.Calendar;
import java.util.Locale;
public class Note {

    private static int idCount = 1;
    private int Id;
    private String title;
    private String content;
    private String timeAndDate;
    public Note(String title, String content) {
        this.Id = idCount++;
        this.title = title;
        this.content = content;
        this.timeAndDate = getCurrentTimeAndDate();


    }
    private String getCurrentTimeAndDate() {
        Calendar calendar = Calendar.getInstance(Locale.getDefault());
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);


        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int month = calendar.get(Calendar.MONTH) + 1;
        int year = calendar.get(Calendar.YEAR);

        return String.format("%02d:%02d %02d.%02d.%d", hour, minute, day, month, year);
    }

    public String getTitle() {
        return title;
    }

    public int getId(){
        return id;
    }


    public String getContent() {
        return content;
    }

    public String getTimeAndDate() {
        return timeAndDate;
    }


}
