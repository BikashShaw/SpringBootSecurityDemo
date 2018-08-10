package demo.spring.boot.security.rest;

import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {

    @Secured({"ROLE_ADMIN"})
    @RequestMapping("/admin/greeting")
    public String greeting() {
        return "Hello Admin!";
    }
}
