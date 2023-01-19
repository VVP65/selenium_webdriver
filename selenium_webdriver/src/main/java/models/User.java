package models;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data

public class User {
    private String username;
    private String password;
}