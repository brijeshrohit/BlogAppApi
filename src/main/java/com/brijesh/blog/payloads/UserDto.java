package com.brijesh.blog.payloads;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class UserDto {

    private int id;

    @NotEmpty(message = "Must not be empty")
    @Size(min = 4, message = "Username must be minimum 4 char long!!!")
    private String name;

    @Email(message = "Invalid email!!!")
    private String email;

    @NotEmpty(message = "Must not be empty")
    @Size(min = 4, max = 10, message = "Password must be min 4 and max 10 char long!!")
    private String password;

    @NotEmpty(message = "Must not be empty")
    @Size(max = 20, message = "Please enter a short and accurate introduction!!")
    private String about;
}
