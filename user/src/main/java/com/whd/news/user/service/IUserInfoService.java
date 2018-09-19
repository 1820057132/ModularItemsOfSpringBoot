package com.whd.news.user.service;

import com.whd.news.user.bean.UserInfo;

/**
 * Created by xhbg on 2018/3/25.
 */
public interface IUserInfoService {

    UserInfo getInfo(UserInfo user)throws Exception;
}
