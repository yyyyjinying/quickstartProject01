package com.zjy.springbootmybatisplus.config.asconfig;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;

@Component
@Aspect
@Order(1) // 多个切面的执行顺序
public class MyAspect {

    @Pointcut("execution(* com.zjy.springbootmybatisplus.service.impl.TeacherServiceImpl.getPage(..))")
    public void pointCut(){}

    // 前置通知
    @Before("pointCut() && args(..)")
    public void before(JoinPoint joinPoint){
        Object[] args = joinPoint.getArgs();

        System.out.println(Arrays.toString(args));

        System.out.println("before……");
    }

    @AfterReturning("pointCut()")
    public void afterReturning(){
        System.out.println("afterReturn……");
    }

    @AfterThrowing("pointCut()")
    public void afterThrowing(){
        System.out.println("afterThrowing……");
    }

    // 后置通知
    @After("pointCut()")
    public void after(){
        System.out.println("after……");
    }

    @Around("pointCut()")
    public Object around(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("around-before……");
        Object proceed = jp.proceed();
        System.out.println("around-after……");
        return proceed;
    }

}
