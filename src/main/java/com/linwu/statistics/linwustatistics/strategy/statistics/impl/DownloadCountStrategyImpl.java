package com.linwu.statistics.linwustatistics.strategy.statistics.impl;

import com.linwu.statistics.linwustatistics.strategy.StatisticsStrategy;
import org.springframework.stereotype.Component;

/**
 * @author ：林雾
 * @date ：2020/01/15
 * @description :
 */
@Component("downloadCountStrategy")
public class DownloadCountStrategyImpl implements StatisticsStrategy {
  @Override
  public void process(Long bizId) {
    System.out.println("执行downloadCountStrategy..."+bizId);
  }
}
