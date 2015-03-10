package com.epam.ef.blog;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils {

    private static final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("d MMM yyyy, H:mm");

    public static String formatDate(Date date) {
        return simpleDateFormat.format(date);
    }

}
