package org.example;

import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface ITabela {

        long value();
        String[] names ();
        RetentionPolicy[] value2();

        RetentionPolicy[] value3();

        String nomeDefault() default "";

}
