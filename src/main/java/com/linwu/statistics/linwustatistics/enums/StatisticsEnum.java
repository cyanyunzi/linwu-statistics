package com.linwu.statistics.linwustatistics.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author ：林雾
 * @date ：2020/01/15
 * @description :
 */
@Getter
@AllArgsConstructor
public enum StatisticsEnum {
  DOWNLAOD_COUNT("downloadCountStrategy", "下载统计"),

  VIEW_COUNT("viewCountStrategy", "下载统计"),
  ;

  private String beanName;

  private String msg;
}
