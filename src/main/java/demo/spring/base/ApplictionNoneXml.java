package demo.spring.base;
// change
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// annotation
  //  change 2 
@Configuration
@ComponentScan(basePackages = {"demo.spring.base"})
public class ApplictionNoneXml {

	public static void main(String args[]){
		ApplicationContext ctx = new AnnotationConfigApplicationContext(ApplictionNoneXml.class);
		System.out.println(ctx);
		//ctx.refresh();
		
		MyService service = (MyService)ctx.getBean("myServiceImpl");
		service.getMyBean();
		
		MyBean bean = (MyBean)ctx.getBean("myBean");
		bean.setPassword("allan");
		System.out.println(bean.getPassword());
		
		System.out.println(bean.getCard().getCardNO());
		
		System.out.println(bean.getUsername());
		 
		
	}
	
}
