import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@EnableAutoConfiguration
public class BeerShop {
  public static void main(String[] args) {
    SpringApplication.run(BeerShop.class, args);
  }
}
