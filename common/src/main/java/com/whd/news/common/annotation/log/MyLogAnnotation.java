package com.whd.news.common.annotation.log;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by xhbg on 2018/5/13.
 */
@Target(ElementType.METHOD)//应该在什么位置
@Retention(RetentionPolicy.RUNTIME)//注解的注解保留多久
public @interface MyLogAnnotation {
    String name();
}
