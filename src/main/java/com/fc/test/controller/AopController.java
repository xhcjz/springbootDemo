package com.fc.test.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;


/**
 * 使用@Aspect注解将此类定义为切面类
 * 根据晓风轻著的ControllerAOP所修改
 * 晓风轻大佬(很大的佬哥了)：https://xwjie.github.io/
 */

@Aspect
@Component
public class AopController {

/**
     * 定义切入点，切入点为com.example.demo.aop.AopController中的所有函数
     *通过@Pointcut注解声明频繁使用的切点表达式
     */

    @Pointcut("execution(public * com.fc.test.controller..*(..)))")
    public void BrokerAspect(){

    }


/**
     * @description  在连接点执行之前执行的通知
     */

    @Before("BrokerAspect()")
    public void doBeforeGame(){

    }


/**
     * @description  在连接点执行之后执行的通知（返回通知和异常通知的异常）
     */

    @After("BrokerAspect()")
    public void doAfterGame(){
    }


/**
     * @description  在连接点执行之后执行的通知（返回通知）
     */

    @AfterReturning("BrokerAspect()")
    public void doAfterReturningGame(){

    }


/**
     * @description  在连接点执行之后执行的通知（异常通知）
     */

    @AfterThrowing("BrokerAspect()")
    public void doAfterThrowingGame(){

    }

    @Around("BrokerAspect()")
    public Object doAround(ProceedingJoinPoint point) {
        long start = System.currentTimeMillis();

        Object[] args = point.getArgs();
        System.out.print("=====环绕通知开始=====");

        Object result;
        try {
            result = point.proceed(args);
        } catch (Throwable e) {
            System.err.print( e);
            JSONObject response = new JSONObject();
            response.put("returnCode", "999999");
            response.put("returnMsg", "失败");
            response.put("timestamp", LocalDateTime.now());
            result = response;
        }
        System.out.print("环绕通知结束:\r\n{}"+JSON.toJSONString(result, true));
        long end = System.currentTimeMillis();
        System.out.print("=====耗时:[{}]ms====="+ (end - start));
        return result;
    }
}
