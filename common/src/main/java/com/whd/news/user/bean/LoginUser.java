package com.whd.news.user.bean;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class LoginUser {

    //public static final String TABLE_ALIAS = "LoginUser";
    //public static final String ALIAS_ID = "id";
    //public static final String ALIAS_PASSWORD = "password";
    //public static final String ALIAS_USER_NAME = "userName";
    //public static final String ALIAS_USER_ID = "userId";
    //public static final String ALIAS_IS_REMOVED = "isRemoved";
    //public static final String ALIAS_PHONE = "phone";
    //public static final String ALIAS_LOGIN_NAME = "loginName";

    //可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
    //columns START
    //@Length(max=32)
    //id
    private java.lang.String id;
    //@NotBlank @Length(max=32)
    //password
    private java.lang.String password;
    //@Length(max=32)
    //userName
    private java.lang.String userName;
    //@NotBlank @Length(max=32)
    //userId
    private java.lang.String userId;
    //@NotNull @Max(127)
    //isRemoved
    private Integer isRemoved;
    //@Length(max=20)
    //phone
    private java.lang.String phone;
    //@NotBlank @Length(max=32)
    //loginName
    private java.lang.String loginName;
    //columns END


    public void setId(java.lang.String value) {
        this.id = value;
    }

    public java.lang.String getId() {
        return this.id;
    }

    public void setPassword(java.lang.String value) {
        this.password = value;
    }

    public java.lang.String getPassword() {
        return this.password;
    }

    public void setUserName(java.lang.String value) {
        this.userName = value;
    }

    public java.lang.String getUserName() {
        return this.userName;
    }

    public void setUserId(java.lang.String value) {
        this.userId = value;
    }

    public java.lang.String getUserId() {
        return this.userId;
    }

    public void setIsRemoved(Integer value) {
        this.isRemoved = value;
    }

    public Integer getIsRemoved() {
        return this.isRemoved;
    }

    public void setPhone(java.lang.String value) {
        this.phone = value;
    }

    public java.lang.String getPhone() {
        return this.phone;
    }

    public void setLoginName(java.lang.String value) {
        this.loginName = value;
    }

    public java.lang.String getLoginName() {
        return this.loginName;
    }



}





