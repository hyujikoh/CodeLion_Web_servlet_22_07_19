package org.example.Web_servlet.servlet_ver1.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.Web_servlet.servlet_ver1.article.model.ArticleDto;

public class Ut {
    public static class json {

        private static final ObjectMapper om;
        static{
            om = new ObjectMapper();
        }

        public static String toStr(Object obj, String defaultValue) {


            try {
                return om.writeValueAsString(obj);
            } catch (JsonProcessingException e) {
                return defaultValue;
            }
        }

        public static Object toObj_(String jsonStr, Class cls, Object defaultValue) {
            try {
                return om.readValue(jsonStr, cls);
            } catch (JsonProcessingException e) {
                return defaultValue;
            }
        }
        public static <T> T toObj(String jsonStr, Class<T> cls, T defaultValue) {
            try {
                return (T) om.readValue(jsonStr, cls);
            } catch (JsonProcessingException e) {
                return defaultValue;
            }
        }
    }
}