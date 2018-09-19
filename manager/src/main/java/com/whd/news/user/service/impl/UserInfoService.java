package com.whd.news.user.service.impl;

import com.whd.news.user.bean.UserInfo;
import com.whd.news.user.mapper.UserInfoMapper;
import com.whd.news.user.service.IUserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * Created by xhbg on 2018/3/25.
 */
@Service("UserInfoService")
@Primary
public class UserInfoService implements IUserInfoService {

    @Autowired
    private UserInfoMapper userMapper;

    @Override
    public UserInfo getInfo(UserInfo user)throws Exception{
        try {
            return userMapper.selectOne(user);
        } catch (Exception e) {
            throw e;
        }
    }
}
