package com.dzh.leyou.serach.client;

import com.dzh.item.api.BrandApi;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("item-service")
public interface BrandClient extends BrandApi {

}
