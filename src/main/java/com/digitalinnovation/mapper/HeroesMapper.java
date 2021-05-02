package com.digitalinnovation.mapper;

import com.digitalinnovation.document.Heroes;
import com.digitalinnovation.dto.HeroesDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface HeroesMapper {

    HeroesMapper INSTANCE = Mappers.getMapper(HeroesMapper.class);

    Heroes toModel(HeroesDTO heroesDTO);

    HeroesDTO toDTO(Heroes heroes);

}
