package minevalley.core.api;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Description {

    String name();

    String version() default "1.0";

    String[] authors();

    String[] dependencies() default "";

    int loadingPriority() default 0;
}
