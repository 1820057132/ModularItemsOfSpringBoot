package com.whd.news.user.mapper;

import com.whd.news.common.IBaseMapper;
import com.whd.news.user.bean.UserInfo;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by xhbg on 2018/3/25.
 */
@Mapper
public interface UserInfoMapper extends IBaseMapper<UserInfo , String> {

}
