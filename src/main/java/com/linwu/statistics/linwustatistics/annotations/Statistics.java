package com.linwu.statistics.linwustatistics.annotations;

import com.linwu.statistics.linwustatistics.enums.StatisticsEnum;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author ：林雾
 * @date ：2020/01/15
 * @description :
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Statistics {
    StatisticsEnum type();
    long bizId();
}
