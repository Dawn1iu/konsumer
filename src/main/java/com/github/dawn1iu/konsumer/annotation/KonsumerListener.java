package com.github.dawn1iu.konsumer.annotation;

import org.springframework.cloud.stream.annotation.StreamListener;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Description:
 * @Author: liujinquan
 * @Date: 2020/2/27 3:33 下午
 */
@StreamListener
@Target({ ElementType.METHOD, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface KonsumerListener {

    int concurrency() default 1;

}
