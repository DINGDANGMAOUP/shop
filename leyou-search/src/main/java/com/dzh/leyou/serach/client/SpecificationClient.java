package com.dzh.leyou.serach.client;

import com.dzh.item.api.SpecificationApi;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("item-service")
public interface SpecificationClient extends SpecificationApi {

}
