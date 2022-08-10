package model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Builder
public class User {
    private String firstName;
    private String lastName;
    private String userName;
}
