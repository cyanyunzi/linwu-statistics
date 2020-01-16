package com.linwu.statistics.linwustatistics.controller;

import com.linwu.statistics.linwustatistics.service.DownloadCountService;
import com.linwu.statistics.linwustatistics.service.ViewCountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：林雾
 * @date ：2020/01/16
 * @description :
 */
@RestController
public class StatisticsController {
  @Autowired private DownloadCountService downloadCountService;
  @Autowired private ViewCountService viewCountService;

  @GetMapping("/downloadCount/{bizId}")
  public void downloadCount(@PathVariable Long bizId) {
    downloadCountService.test(bizId);
  }
  
  @GetMapping("/viewCount/{bizId}")
  public void viewCount(@PathVariable Long bizId) {
    viewCountService.test(bizId);
  }
}
