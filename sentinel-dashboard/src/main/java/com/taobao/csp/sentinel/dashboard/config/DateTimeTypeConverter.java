package com.taobao.csp.sentinel.dashboard.config;

import com.google.gson.*;
import org.joda.time.DateTime;

import java.lang.reflect.Type;
import java.text.SimpleDateFormat;
import java.util.Date;

class DateTimeTypeConverter implements JsonSerializer<Date>, JsonDeserializer<Date> {
    // No need for an InstanceCreator since DateTime provides a no-args constructor
    @Override
    public JsonElement serialize(Date src, Type srcType, JsonSerializationContext context) {
        return new JsonPrimitive(new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(src.getTime()));
    }

    @Override
    public Date deserialize(JsonElement json, Type type, JsonDeserializationContext context)
            throws JsonParseException {
        return new DateTime(json.getAsLong()).toDate();

    }
}