package com.dzh.leyou.serach.client;

import com.dzh.item.api.GoodsApi;
import org.springframework.cloud.openfeign.FeignClient;


@FeignClient("item-service")
public interface GoodsClient extends GoodsApi {


}
