package reto.tecnico.com.reto_tecnico.api.model;

import lombok.Data;

@Data
public class User {
    private String gender;
    private Name name;
    private Location location;
    private String email;
    private Dob dob;
    private Picture picture;
}
