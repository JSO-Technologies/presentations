package demo.hello;

import demo.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    @Autowired
    public HelloService service;

    @RequestMapping("/hello/{name}")
    public String sayHello(@PathVariable("name") final String name) {
        return service.sayHello(name);
    }
}
