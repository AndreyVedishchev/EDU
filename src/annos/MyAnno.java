package annos;

import javax.swing.text.TabableView;
import java.lang.annotation.*;

/**
 * Created by Андрей on 04.10.2017.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnno {
    int value();
    int max();

}
