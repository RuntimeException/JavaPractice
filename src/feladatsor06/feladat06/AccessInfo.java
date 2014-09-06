package feladatsor06.feladat06;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface AccessInfo {
    Privilege requiredPrivilege() default Privilege.USER;

    String logInfo() default "";
}
