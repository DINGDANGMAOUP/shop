package com.dzh.leyou.serach.client;


import com.dzh.item.api.CategoryApi;
import org.springframework.cloud.openfeign.FeignClient;


@FeignClient("item-service")
public interface CategoryClient extends CategoryApi {

}
