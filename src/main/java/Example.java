import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

/**
 * @author zhuyoulin
 * @program IntelliJ IDEA
 * @description example controller
 * @create 2022-03-02 22:39
 **/
@RestController
@EnableAutoConfiguration
public class Example {
  @RequestMapping("/")
  String home () {
    return "Hello World!";
  }

  public static void main(String[] args) throws Exception{
    SpringApplication.run(Example.class, args);
  }
}
