package reto.tecnico.com.reto_tecnico.api.model;

import lombok.Data;

import java.util.List;

@Data
public class ApiResponse {
    private List<User> results;
}
