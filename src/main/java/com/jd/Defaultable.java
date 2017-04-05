package com.jd;

/**
 * Created by buxiaoming on 2017/3/30.
 */
public interface Defaultable {
    default String notRequired() {
        return "Default implementation";
    }
}


