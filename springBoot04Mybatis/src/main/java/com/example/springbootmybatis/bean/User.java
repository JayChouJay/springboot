package com.example.springbootmybatis.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@AllArgsConstructor @Data @NoArgsConstructor
public class User implements Serializable {

    private Long id;
    private String username;
    private String gender;
    private Date bornday;
    private String occupation;
    private String remark;
}
