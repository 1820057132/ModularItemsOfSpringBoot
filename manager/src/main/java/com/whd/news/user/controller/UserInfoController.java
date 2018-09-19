package com.whd.news.user.controller;

import com.whd.news.common.RestfulResult;
import com.whd.news.common.annotation.log.MyLogAnnotation;
import com.whd.news.user.bean.UserInfo;
import com.whd.news.user.service.IUserInfoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by xhbg on 2018/3/25.
 */
@RequestMapping("user")
@RestController
public class UserInfoController {

    @Resource
    private IUserInfoService userInfoService ;

    @RequestMapping("/getInfo")
    @MyLogAnnotation(name = "getInfo")
    public RestfulResult getInfo(UserInfo user){
        RestfulResult result = new RestfulResult();
        try {
            //UserInfo data = userInfoService.getInfo(user);
           // result.setData(data);
            result.setReturnFlag(1);
            result.setReturnInfo("sucess");
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
