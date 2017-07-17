package org.calvin.Annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE,ElementType.METHOD,
    ElementType.CONSTRUCTOR,ElementType.ANNOTATION_TYPE,
    ElementType.PACKAGE,ElementType.FIELD,ElementType.LOCAL_VARIABLE})
@Inherited
public @interface TestInfo {
    enum Priority { LOW, MEDIUM, HIGH }
    Priority priority() default Priority.LOW;
    String author() default "Calvin";
    String lastChanged() default "2017-01-01";
    String description() default "";
}