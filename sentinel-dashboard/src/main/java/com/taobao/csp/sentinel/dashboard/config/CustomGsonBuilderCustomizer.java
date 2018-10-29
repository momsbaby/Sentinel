package com.taobao.csp.sentinel.dashboard.config;

import com.google.gson.GsonBuilder;
import org.springframework.boot.autoconfigure.gson.GsonBuilderCustomizer;

import java.util.Date;

/**
 * @Description:
 * @Author: ztowh
 * @Date: 2018/10/19 16:25
 */
public class CustomGsonBuilderCustomizer implements GsonBuilderCustomizer {

    @Override
    public void customize(GsonBuilder gsonBuilder) {
        gsonBuilder.registerTypeAdapter(Date.class, new DateTimeTypeConverter()).create();
    }
}
