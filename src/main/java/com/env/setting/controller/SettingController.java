package com.env.setting.controller;

import com.env.setting.domain.EnvUserDo;
import com.env.setting.response.RpcResult;
import com.env.setting.service.EnvUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Intro:
 * @Author: WangJiongDa(yunkai)
 * @Date: 2018/3/8
 * @Time: 下午7:04
 */
@RestController
@RequestMapping("setting")
public class SettingController {

    @Autowired
    private EnvUserService envUserService;

    @RequestMapping(value = "/list")
    public RpcResult<List<EnvUserDo>> list(){
        return envUserService.findList();
    }
}
