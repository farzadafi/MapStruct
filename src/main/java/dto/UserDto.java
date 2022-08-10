package dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Builder
public class UserDto {
    private String firstName;
    private String lastName;
    private String userName;
}
