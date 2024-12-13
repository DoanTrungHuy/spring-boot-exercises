package docker.sample_code.controller;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/user")
public class UserController {
    @GetMapping("/{userId}")
    public int getUser(@PathVariable int userId) {
        return userId;
    }
}
