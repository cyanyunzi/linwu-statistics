package com.linwu.statistics.linwustatistics.strategy.handle;

import com.linwu.statistics.linwustatistics.enums.StatisticsEnum;
import com.linwu.statistics.linwustatistics.strategy.StatisticsStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ：林雾
 * @date ：2020/01/16
 * @description :
 */
@Component
public class StatisticsHandle {
  @Autowired private Map<String, StatisticsStrategy> map = new HashMap<>();

  public void execute(Long bizId, StatisticsEnum statisticsEnum) {
    StatisticsStrategy statisticsStrategy = map.get(statisticsEnum.getBeanName());
    if (statisticsStrategy == null) {
      throw new IllegalArgumentException("统计策略不存在");
    }

    statisticsStrategy.process(bizId);
  }
}
