package com.whd.news.user.bean;

import com.fasterxml.jackson.annotation.JsonInclude;


/**
 * @author 王海冬
 * @version V1.0
 * @Description:UserInfo
 * @Encode:UTF-8
 * @date 2018-03-25 14:27
 */


@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserInfo {

    //public static final String TABLE_ALIAS = "UserInfo";
    //public static final String ALIAS_ID = "id";
    //public static final String ALIAS_NAME = "name";
    //public static final String ALIAS_SEX = "sex";
    //public static final String ALIAS_PHONE = "phone";
    //public static final String ALIAS_EMILE = "emile";
    //public static final String ALIAS_ADDRESS = "address";
    //public static final String ALIAS_COMPETENCE = "competence";

    //可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
    //columns START
    //@Length(max=32)
    //id
    private java.lang.String id;
    //@Length(max=32)
    //name
    private java.lang.String name;
    //@NotNull @Max(127)
    //sex
    private String sex;
    //@Length(max=32)
    //phone
    private java.lang.String phone;
    //@Length(max=32)
    //emile
    private java.lang.String emile;
    //@Length(max=100)
    //address
    private java.lang.String address;
    //@NotNull @Max(127)
    //competence
    private Integer competence;
    //columns END


    public void setId(java.lang.String value) {
        this.id = value;
    }

    public java.lang.String getId() {
        return this.id;
    }

    public void setName(java.lang.String value) {
        this.name = value;
    }

    public java.lang.String getName() {
        return this.name;
    }

    public void setSex(String value) {
        this.sex = value;
    }

    public String getSex() {
        return this.sex;
    }

    public void setPhone(java.lang.String value) {
        this.phone = value;
    }

    public java.lang.String getPhone() {
        return this.phone;
    }

    public void setEmile(java.lang.String value) {
        this.emile = value;
    }

    public java.lang.String getEmile() {
        return this.emile;
    }

    public void setAddress(java.lang.String value) {
        this.address = value;
    }

    public java.lang.String getAddress() {
        return this.address;
    }

    public void setCompetence(Integer value) {
        this.competence = value;
    }

    public Integer getCompetence() {
        return this.competence;
    }


}





