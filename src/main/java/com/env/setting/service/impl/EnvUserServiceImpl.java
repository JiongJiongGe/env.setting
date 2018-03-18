package com.env.setting.service.impl;

import com.env.setting.domain.EnvUserDo;
import com.env.setting.mapper.EnvUserMapper;
import com.env.setting.response.RpcResult;
import com.env.setting.service.EnvUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Intro:
 * @Author: WangJiongDa(yunkai)
 * @Date: 2018/3/9
 * @Time: 下午7:29
 */
@Service("envUserService")
public class EnvUserServiceImpl implements EnvUserService{

    @Autowired
    private EnvUserMapper envUserMapper;

    @Override
    public RpcResult<List<EnvUserDo>> findList(){
        return RpcResult.ofSuccess(envUserMapper.queryList());
    }
}
