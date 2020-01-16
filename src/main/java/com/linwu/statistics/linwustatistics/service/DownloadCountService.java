package com.linwu.statistics.linwustatistics.service;

import com.linwu.statistics.linwustatistics.annotations.Statistics;
import com.linwu.statistics.linwustatistics.enums.StatisticsEnum;
import org.springframework.stereotype.Service;

/**
 * @author ：林雾
 * @date ：2020/01/16
 * @description :
 */
@Service
public class DownloadCountService {

  @Statistics(type = StatisticsEnum.DOWNLAOD_COUNT, bizId = 1)
  public void test(Long bizId) {
    System.out.println("进入下载量Service");
  }
}
