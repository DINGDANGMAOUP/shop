package com.dzh.item.pojo;

import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

/**
 * @author kueoneko
 */
@Data
@Table(name = "tb_brand")
public class Brand {

  @Id
  @KeySql(useGeneratedKeys = true)
  private Long id;
  // 品牌名称
  private String name;
  // 品牌图片
  private String image;
  private Character letter;
  // getter setter 略
}