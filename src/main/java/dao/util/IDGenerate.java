package dao.util;

import java.util.UUID;

public class IDGenerate {
    public static String generate(){
        return UUID.randomUUID().toString().replaceAll("-", "")
                .toUpperCase().toUpperCase();
    }
}