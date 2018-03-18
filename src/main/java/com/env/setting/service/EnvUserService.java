package com.env.setting.service;

import com.env.setting.domain.EnvUserDo;
import com.env.setting.response.RpcResult;

import java.util.List;

/**
 * @Intro:
 * @Author: WangJiongDa(yunkai)
 * @Date: 2018/3/9
 * @Time: 下午7:29
 */
public interface EnvUserService {

    RpcResult<List<EnvUserDo>> findList();
}
