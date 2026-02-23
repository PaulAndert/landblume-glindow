package de.landblume_glindow.website.store.adapter;

import java.util.List;

import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Service;

import de.landblume_glindow.website.domain.model.Vacation;
import de.landblume_glindow.website.domain.port.output.VacationOutputPort;
import de.landblume_glindow.website.store.mapper.VacationEntityMapper;
import de.landblume_glindow.website.store.repository.VacationRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class VacationOutputPortAdapter implements VacationOutputPort {
    private final VacationRepository vacationRepository;
    private final VacationEntityMapper vacationEntityMapper = Mappers.getMapper(VacationEntityMapper.class);

    @Override
    public List<Vacation> loadActiveVacations() {
        return vacationRepository
            .findAll()
            .stream()
            .map(vacationEntityMapper::toDomain)
            .toList();
    }
    
}
