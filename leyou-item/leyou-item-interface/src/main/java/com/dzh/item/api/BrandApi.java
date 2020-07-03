package com.dzh.item.api;


import com.dzh.item.pojo.Brand;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface BrandApi {

  /**
   * 根据id查询品牌
   *
   * @param id
   * @return
   */
  @GetMapping("brand/{id}")
  Brand queryBrandById(@PathVariable("id") Long id);

  @GetMapping("brand/brandsList")
  List<Brand> queryBrandByIds(@RequestParam("ids") List<Long> ids);

  ;
}
