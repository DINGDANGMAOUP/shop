package com.dzh.leyou.serach.repository;

import com.dzh.leyou.serach.pojo.Goods;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;


public interface GoodsRepository extends ElasticsearchRepository<Goods, Long> {

}
