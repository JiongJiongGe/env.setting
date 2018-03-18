package com.env.setting.mapper;

import com.env.setting.domain.EnvUserDo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Intro:
 * @Author: WangJiongDa(yunkai)
 * @Date: 2018/3/9
 * @Time: 上午10:17
 */
@Mapper
@Component
public interface EnvUserMapper {

    List<EnvUserDo> queryList();
}
