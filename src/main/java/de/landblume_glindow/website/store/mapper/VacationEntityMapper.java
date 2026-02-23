package de.landblume_glindow.website.store.mapper;

import org.mapstruct.Mapper;

import de.landblume_glindow.website.domain.model.Vacation;
import de.landblume_glindow.website.store.entity.VacationEntity;

@Mapper(componentModel = "spring")
public interface VacationEntityMapper {
    Vacation toDomain(VacationEntity entity);
}
