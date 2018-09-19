package com.whd.news.common.annotation.log;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;
import java.lang.reflect.Method;

/**
 * Created by xhbg on 2018/5/13.
 */
@Aspect
@Component
public class MyLogAspect {

    @Pointcut("@annotation(com.whd.news.common.annotation.log.MyLogAnnotation)")
    public void annotationPointcut(){};

    @Before("annotationPointcut()")
    public void after(JoinPoint joinPoint){
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        MyLogAnnotation myLogAnnotation = method.getAnnotation(MyLogAnnotation.class);
        System.out.println("=====================" + myLogAnnotation.name() + "===================");
    }
}
