package de.landblume_glindow.website.boundary.mapper;

import org.mapstruct.Mapper;

import de.landblume_glindow.website.boundary.dto.VacationDto;
import de.landblume_glindow.website.domain.model.Vacation;

@Mapper(componentModel = "spring")
public interface VacationDtoMapper {
    VacationDto toDto(Vacation domain);
}
