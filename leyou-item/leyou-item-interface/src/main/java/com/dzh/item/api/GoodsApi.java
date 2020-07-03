package com.dzh.item.api;


import com.dzh.item.pojo.Sku;
import com.dzh.item.pojo.Spu;
import com.dzh.item.pojo.SpuDetail;
import com.dzh.leyou.common.dto.CartDTO;
import com.dzh.leyou.common.vo.PageResult;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


public interface GoodsApi {


  /**
   * 根据spu的id查询详情detail
   *
   * @param spuId
   * @return
   */
  @GetMapping("/spu/detail/{id}")
  SpuDetail queryDetailById(@PathVariable("id") Long spuId);

  /**
   * 根据spu查询下边的所有sku
   *
   * @param spuId
   * @return
   */
  @GetMapping("sku/list")
  List<Sku> querySkuBySpuId(@RequestParam("id") Long spuId);

  @GetMapping("/spu/page")
  PageResult<Spu> querySpuByPage(
      @RequestParam(value = "page", defaultValue = "1") Integer page,
      @RequestParam(value = "rows", defaultValue = "5") Integer rows,
      @RequestParam(value = "saleable", required = false) Boolean saleable,
      @RequestParam(value = "key", required = false) String key);

  /**
   * 根据spu的id查询spu
   *
   * @param id
   * @return
   */
  @GetMapping("spu/{id}")
  Spu querySpuById(@PathVariable("id") Long id);

  /**
   * 根据id查询sku
   *
   * @param id
   * @return
   */
  @GetMapping("/sku/{id}")
  ResponseEntity<Sku> querySkuById(@PathVariable("id") Long id);

  /**
   * 批量查询sku
   *
   * @param ids
   * @return
   */
  @GetMapping("sku/list/ids")
  List<Sku> querySkuByIds(@RequestParam("ids") List<Long> ids);

  /**
   * 减库存
   *
   * @param carts
   * @return
   */
  @PostMapping("stock/decrease")
  Void decreaseStock(@RequestBody List<CartDTO> carts);
}
