import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BeanConfiguration {

  @Bean(name = "helloworld")
  public HelloWorldBean getHelloBean() {
    HelloWorldBean helloWorldBean = new HelloWorldBean();
    helloWorldBean.setMessage("Hello, World!");
    return helloWorldBean;
  }

  @Bean(name="car")
  @Scope("prototype")
  public Car getCar() {
    return new Car();
  }
}
