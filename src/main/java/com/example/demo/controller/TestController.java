package com.example.demo.controller;

import com.example.demo.domain.DeptInfo;
import com.example.demo.domain.UserInfo;
import com.example.demo.his.HisService;
import com.example.demo.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author wusong
 * @date 2023年11月03日 11:06
 */
@Controller
@RequestMapping("/test")
public class TestController {
    @Autowired
    private UserInfoService userInfoService;

    @Autowired
    private HisService hisService;

    @ResponseBody
    @GetMapping("/list")
    public Object list() {
        List<DeptInfo> deptInfos = hisService.list();
        System.out.println(deptInfos);
        List<UserInfo> userInfos = userInfoService.list();
        System.out.println(userInfos);
        return deptInfos;
    }

}
