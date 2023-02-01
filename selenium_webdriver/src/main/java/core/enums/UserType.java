package core.enums;


import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum UserType {
    STANDARD_USER,
    LOCKED_OUT_USER
}