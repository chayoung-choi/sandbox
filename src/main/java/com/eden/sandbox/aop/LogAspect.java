package com.eden.sandbox.aop;

import lombok.extern.log4j.Log4j2;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Component
@Aspect // Proxy 패턴
@Log4j2
public class LogAspect {

  @Around("@annotation(LogExecutionTime)")
  public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
    StopWatch stopWatch = new StopWatch();
    stopWatch.start();

    Object proceed = joinPoint.proceed();

    stopWatch.stop();
    log.info(stopWatch.prettyPrint());
    return proceed;
  }
}
