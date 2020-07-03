package com.dzh.leyou.serach.web;



import com.dzh.leyou.common.vo.PageResult;
import com.dzh.leyou.serach.pojo.Goods;
import com.dzh.leyou.serach.pojo.SearchRequest;
import com.dzh.leyou.serach.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class SearchController{

    @Autowired
    private SearchService searchService;


    /**
     * 搜索功能
     * @param searchRequest
     * @return
     */
    @PostMapping("page")
    public ResponseEntity<PageResult<Goods>> search(@RequestBody SearchRequest searchRequest){
       return ResponseEntity.ok(searchService.search(searchRequest));
    }




}
