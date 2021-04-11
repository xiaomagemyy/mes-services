package com.unilever.hefei.mes.common.constant;

import java.lang.annotation.*;

/**
 * 切换数据注解 可以用于类或者方法级别 方法级别优先级 > 类级别
 */
@Target({ElementType.METHOD, ElementType.TYPE, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface DataSource {
    String value() default "master"; //该值即key值
    static String MES_AP="master";
    static String SCADA_DB="scada";
    static String POSTGRE_DB="postgre";
}