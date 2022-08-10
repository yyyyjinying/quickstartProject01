package com.zjy.springbootmybatisplus.config.asconfig;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(3)
public class MyAspect02 {

    @Pointcut("execution(* com.zjy.springbootmybatisplus.service.impl.TeacherServiceImpl.getPage(..))")
    public void pointCut(){}

    // 前置通知
    @Before("pointCut()")
    public void before(){
        System.out.println("before2……");
    }

    @AfterReturning("pointCut()")
    public void afterReturning(){
        System.out.println("afterReturn2……");
    }

    @AfterThrowing("pointCut()")
    public void afterThrowing(){
        System.out.println("afterThrowing2……");
    }

    // 后置通知
    @After("pointCut()")
    public void after(){
        System.out.println("after2……");
    }

    @Around("pointCut()")
    public Object around(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("around-before2……");
        Object proceed = jp.proceed();
        System.out.println("around-after2……");
        return proceed;
    }

}
