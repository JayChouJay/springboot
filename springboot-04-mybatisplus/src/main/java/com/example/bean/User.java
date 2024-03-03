package com.example.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@AllArgsConstructor @Data @NoArgsConstructor
public class User implements Serializable {
    //允许主键自增
    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;
    private String username;
    private String gender;
    private Date bornday;
    private String occupation;
    private String remark;
}
