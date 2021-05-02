package com.digitalinnovation.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class HeroesDTO {

    private String id;

    @NotNull
    private String name;

    @NotNull
    private String universe;

    @NotNull
    private int films;

}
