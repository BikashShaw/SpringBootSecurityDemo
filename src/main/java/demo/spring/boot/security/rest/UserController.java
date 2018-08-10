package demo.spring.boot.security.rest;

import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {

    @Secured({"ROLE_USER"})
    @RequestMapping("/user/greeting")
    public String greeting() {
        return "Hello User!";
    }
}
