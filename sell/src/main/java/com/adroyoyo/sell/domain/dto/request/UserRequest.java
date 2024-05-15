package com.adroyoyo.sell.domain.dto.request;

import com.adroyoyo.sell.domain.entity.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserRequest {

    private long id;
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private Role role;
}
