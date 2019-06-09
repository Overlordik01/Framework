package org.framework.Generators.Annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface ConfigurationInfo {
    String type();
    int version();
    String generator() default "DEFAULT_GENERATOR";
}
