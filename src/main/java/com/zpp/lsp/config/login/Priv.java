package com.zpp.lsp.config.login;

import java.lang.annotation.*;

/**
 * @Author: 张平平
 * @Date: 2021/3/10 14:38
 */
@Inherited
@Documented
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface Priv {

    boolean login() default false;

}