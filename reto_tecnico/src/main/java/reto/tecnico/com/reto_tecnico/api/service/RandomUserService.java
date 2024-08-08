package reto.tecnico.com.reto_tecnico.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import reto.tecnico.com.reto_tecnico.api.model.ApiResponse;
import reto.tecnico.com.reto_tecnico.api.model.User;

import java.util.List;

@Service
public class RandomUserService {
    private final RestTemplate restTemplate;

    @Autowired
    public RandomUserService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public List<User> getRandomUsers(int count) {
        String url = "https://randomuser.me/api/?results=" + count;
        ApiResponse response = restTemplate.getForObject(url, ApiResponse.class);
        return response.getResults();
    }
}
