package com.epam.ef.blog;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class Utils {

    public static final Random random = new Random();
    private static final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("d MMM yyyy, H:mm");

    public static String formatDate(Date date) {
        return simpleDateFormat.format(date);
    }

}
