package guru.springframework.controllers;

import guru.springframework.services.GreetingService;
import guru.springframework.services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by jt on 5/24/17.
 */
@Controller
public class ConstructorInjectedController {

    @Autowired
     private GreetingService greetingService;

//    public ConstructorInjectedController(GreetingService greetingService) {
//        this.greetingService = greetingService;
//    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
