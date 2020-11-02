package org.example.pagemodels;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;



@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface TestData
{
    String testId() default "";
    String testSetId() default "";
    String[] tags() default "";
}