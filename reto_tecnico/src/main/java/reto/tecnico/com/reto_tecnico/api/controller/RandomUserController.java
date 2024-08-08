package reto.tecnico.com.reto_tecnico.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reto.tecnico.com.reto_tecnico.api.model.User;
import reto.tecnico.com.reto_tecnico.api.service.RandomUserService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/randomuser")
public class RandomUserController {
    private final RandomUserService randomUserService;

    public RandomUserController(RandomUserService randomUserService) {
        this.randomUserService = randomUserService;
    }

    @GetMapping("/list")
    public List<User> getRandomUsers() {
        return randomUserService.getRandomUsers(10);
    }
}
