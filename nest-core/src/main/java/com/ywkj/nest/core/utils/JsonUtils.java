package com.ywkj.nest.core.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Created by zhaofujun on 2017/3/3.
 */
public class JsonUtils {
    public static String toJsonString(Object object) {
        Gson gson = new GsonBuilder().disableHtmlEscaping().create();
        return gson.toJson(object);
    }

    public static <T> T toObj(String jsonString, Class<T> tClass) {
        Gson gson = new GsonBuilder().disableHtmlEscaping().create();
        return gson.fromJson(jsonString, tClass);
    }
}
