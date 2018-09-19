package com.whd.news.common;

/**
 * Created by xhbg on 2018/3/26.
 */
public class RestfulResult {
    private Integer returnFlag;
    private Object data;
    private String returnInfo;

    public RestfulResult(){

    }


    public Integer getReturnFlag() {
        return returnFlag;
    }

    public void setReturnFlag(Integer returnFlag) {
        this.returnFlag = returnFlag;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getReturnInfo() {
        return returnInfo;
    }

    public void setReturnInfo(String returnInfo) {
        this.returnInfo = returnInfo;
    }


}
