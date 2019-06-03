package com.htp.tools;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Util {
    public static Timestamp convertStringToTimestamp(String str_date) {
        try {
            DateFormat formatter;
            formatter = new SimpleDateFormat("dd.MM.yyyy HH:mm");
            // you can change format of date
            Date date = formatter.parse(str_date);
            java.sql.Timestamp timeStampDate = new Timestamp(date.getTime());

            return timeStampDate;
        } catch (ParseException e) {
            System.out.println("Exception :" + e);
            return null;
        }
    }

    public static String convertTimestampToString(Timestamp timestamp) {
        try {
            Timestamp ts = timestamp;
            Date date = new Date();
            date.setTime(ts.getTime());
            String formattedDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);

            return formattedDate;
        } catch (Exception e) {
            System.out.println("Exception :" + e);
            return null;
        }
    }
}
