package com.example.domain;

import com.sun.istack.internal.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Bean;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.Date;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class User implements Serializable {

    @NotBlank(message = "用户名不能为空")
    private String username;
    @NotBlank
    private String gender;
    @NotBlank(message = "{guest.work.notblank}")
    private String work;
}
