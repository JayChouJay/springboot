package com.example.controller;

import com.example.domain.User;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
public class UserController {
    /**
     * @Valid 直接放在Bean前方
     * 用来校验他是否符合注解规则
     * 默认是普通模式（失败结果全部返回）
     */
    @PostMapping("/user")
    public String add(@Valid User user) {
        System.out.println(user);
        return "Success";
    }

    /**
     * 通过BindingResult自定义返回的json
     */
    @PostMapping("/user3")
    public String add3(@Valid User user, BindingResult result) {
        if (result.getErrorCount() > 0) {
            List<FieldError> fieldErrorList = result.getFieldErrors();
            StringBuffer stringBuffer = new StringBuffer();
            for (FieldError fieldError : fieldErrorList) {
                stringBuffer.append(fieldError.getField());
                stringBuffer.append("\t");
                stringBuffer.append(fieldError.getDefaultMessage());
                stringBuffer.append("\n");
            }
            return stringBuffer.toString();
        }
        return "Success";
    }

    /**
     * 本测试代表说，Validator是拦截器，过了之后就不在验证了
     */
    @PostMapping("/user2")
    public String add2(@Valid User user) {
        System.out.println(user);
        user.setUsername("");
        System.out.println(user);
        return "Success2";
    }
}
