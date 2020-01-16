package com.linwu.statistics.linwustatistics.config;

import com.linwu.statistics.linwustatistics.annotations.Statistics;
import com.linwu.statistics.linwustatistics.enums.StatisticsEnum;
import com.linwu.statistics.linwustatistics.strategy.handle.StatisticsHandle;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @author ：林雾
 * @date ：2020/01/15
 * @description :
 */
@Aspect
@Component
public class StatisticsAop {

  @Autowired private StatisticsHandle statisticsHandle;

  @Pointcut(value = "@annotation(com.linwu.statistics.linwustatistics.annotations.Statistics)")
  public void point() {}

  @After(value = "point()")
  public void updateCountField(JoinPoint joinPoint) {
    System.out.println("进入AOP");

    MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
    Method method = methodSignature.getMethod();
    Statistics annotation = AnnotationUtils.findAnnotation(method, Statistics.class);

    StatisticsEnum statisticsEnum = annotation.type();

    statisticsHandle.execute(annotation.bizId(), statisticsEnum);
  }
}
