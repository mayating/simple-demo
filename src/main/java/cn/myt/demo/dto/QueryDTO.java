package cn.myt.demo.dto;

import lombok.Data;

/**
 * @description 查询业务实体
 * @author: mayating
 * @date: 2022/1/2
 */
@Data
public class QueryDTO {
    // 页码
    private Integer pageNo;
    // 页面大小
    private Integer pageSize;
    // 关键字
    private String keyword;
}
