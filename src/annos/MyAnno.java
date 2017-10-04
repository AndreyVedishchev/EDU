package annos;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * Created by Андрей on 04.10.2017.
 */
@Target({ElementType.FIELD, ElementType.METHOD})
public @interface MyAnno {
    int value();

}
