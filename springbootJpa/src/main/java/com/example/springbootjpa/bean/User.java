package com.example.springbootjpa.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;
@Entity
@AllArgsConstructor @Data @NoArgsConstructor
public class User implements Serializable {
    @Id
    private Long id;
    @Column
    private String username;
    private String gender;
    private Date bornday;
    private String occupation;
    private String remark;
}
