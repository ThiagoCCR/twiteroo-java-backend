package com.api.twiteroo.DTOs;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record PostTweetDTO(@NotBlank @NotNull String username,

        @NotBlank @NotNull String avatar,

        @NotBlank @NotNull String text) {

}
