package demo.spring.base.init.collect;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(value=2)
public class Customer implements Person {

}
