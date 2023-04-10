package com.api.twiteroo.DTOs;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record UserDTO(

        @NotBlank @NotNull String username,

        @NotBlank  @NotNull String avatar
        
) {

}


// @Pattern(regexp = "[(http(s)?):\/\/(www\.)?a-zA-Z0-9@:%.\+#=]{2,256}\.[a-z]{2,6}\b([-a-zA-Z0-9@:%\+.#?&//=]*)")