package com.brijesh.blog.payloads;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CategoryDto {

    private Integer categoryId;

    @NotEmpty(message = "Must not be empty")
    @Size(min = 4, message = "name must be minimum 4 char long!!!")
    private String categoryTitle;

    @NotEmpty(message = "Must not be empty")
    @Size(max = 50, message = "Please enter a short and accurate description!!")
    private String categoryDescription;
}
