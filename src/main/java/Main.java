import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

  public static void main(String[] args) {
    ApplicationContext applicationContext =
        new AnnotationConfigApplicationContext(BeanConfiguration.class);
    HelloWorldBean bean =
        applicationContext.getBean("helloworld", HelloWorldBean.class);
    System.out.println(bean.getMessage());
  }
}
