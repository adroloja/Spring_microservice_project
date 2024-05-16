package com.adroyoyo.user.domain.dto.respond;

import com.adroyoyo.user.domain.entities.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserResponse {

    private long id;
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private Role role;
}
