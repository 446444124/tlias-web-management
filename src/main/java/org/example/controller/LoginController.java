package org.example.controller;
import org.example.mapper.EmpMapper;
import org.example.pojo.Emp;
import org.example.pojo.LoginInfo;
import org.example.pojo.Result;
import org.example.service.EmpService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class LoginController {
    private static final Logger log = LoggerFactory.getLogger(LoginController.class);

    @Autowired
    private EmpService  empService;

    @PostMapping
    public Result login(@RequestBody Emp emp) {
        log.info("登录",emp);
       LoginInfo loginInfo = empService.Login(emp);
       if(loginInfo == null){
           return Result.error("用户名或密码错误");
       }
       else{
           return Result.success(loginInfo);
       }

    }

}
