package com.example.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @ApiModel("嘉宾") 声明实例
 * @ApiModelProperty("名字") 声明实例的说明 用于接口的参数显示
 */
@Data
@AllArgsConstructor
@ApiModel("嘉宾")
public class Guest {
    @ApiModelProperty("姓名")
    private String name;
    @ApiModelProperty("角色")
    private String role;
}
