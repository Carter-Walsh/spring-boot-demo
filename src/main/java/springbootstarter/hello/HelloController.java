package springbootstarter.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// This annotation tells Spring that this class is a controller responsible for mapping different requests
@RestController
public class HelloController {

    // @RequestMapping is the annotation you will use to map to a specific endpoint.
    // @RequestMapping is ONLY FOR GET REQUESTS  by default. If you want a different kind of request, you must specify it.
    // When a request comes in at /hello endpoint, this method will run
    @RequestMapping("/hello")
    public String sayHi() {
        return "Hello World!";
    }
}
