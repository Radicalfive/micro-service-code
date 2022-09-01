package top.radical.provider.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : radical
 * @description :
 * @data : 2022/8/30
 **/
@RestController
@RequestMapping(value = "/api")
public class HelloController {
    @GetMapping("/hello")
    public String getHello() {
        return "hello Microservice!";
    }
}
