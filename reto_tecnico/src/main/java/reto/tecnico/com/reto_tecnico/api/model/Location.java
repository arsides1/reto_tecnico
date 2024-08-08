package reto.tecnico.com.reto_tecnico.api.model;

import lombok.Data;

@Data
public class Location {
    private String city;
    private String state;
    private String country;
    private String postcode;
    private Coordinates coordinates;
    private Street street;
    private Timezone timezone;
}
