import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

  public static void main(String[] args) {
    ApplicationContext applicationContext =
        new AnnotationConfigApplicationContext(BeanConfiguration.class);

    HelloWorldBean firstHelloWorld =
        applicationContext.getBean("helloworld", HelloWorldBean.class);
    HelloWorldBean secondHelloWorld =
            applicationContext.getBean("helloworld", HelloWorldBean.class);
    System.out.printf("FirstHelloWorld is SecondHelloWorld: %b%n", firstHelloWorld == secondHelloWorld);

    Car firstCar =
            applicationContext.getBean("car", Car.class);
    Car secondCar =
            applicationContext.getBean("car", Car.class);
    System.out.printf("FirstCar is SecondCar: %b%n", firstCar == secondCar);
  }
}
