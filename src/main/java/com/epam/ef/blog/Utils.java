package com.epam.ef.blog;

import com.epam.ef.blog.entity.User;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class Utils {

    public static final Random random = new Random();
    private static final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("d MMM yyyy, H:mm");

    public static String formatDate(Date date) {
        return simpleDateFormat.format(date);
    }

    public static Object getRandom(List list) {
        if (list.size() > 0) {
            return list.get(Utils.random.nextInt(list.size()));
        } else {
            return null;
        }
    }

}
