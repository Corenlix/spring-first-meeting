import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

  @Bean(name = "helloworld")
  public HelloWorldBean getHelloBean() {
    HelloWorldBean helloWorldBean = new HelloWorldBean();
    helloWorldBean.setMessage("Hello, World!");
    return helloWorldBean;
  }
}
