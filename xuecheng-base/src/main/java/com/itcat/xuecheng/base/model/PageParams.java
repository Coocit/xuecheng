package com.itcat.xuecheng.base.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

/**
 * @author DemonTina
 */
@Data
@ToString
public class PageParams {
    // 当前页码
    @ApiModelProperty("页码")
    private Long pageNo;
    // 每页显示记录数
    @ApiModelProperty("每页记录数")
    private Long pageSize;

    public PageParams() {
    }

    public PageParams(Long pageNo, Long pageSize) {
        this.pageNo = pageNo;
        this.pageSize = pageSize;
    }
}
