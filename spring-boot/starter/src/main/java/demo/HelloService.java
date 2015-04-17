package demo;

import org.springframework.beans.factory.annotation.Autowired;

public class HelloService {
    @Autowired
    private HelloProperties properties;

    public String sayHello(final String name) {
        return properties.getPrefix() + " " + name;
    }
}
