package de.landblume_glindow.website.boundary.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import de.landblume_glindow.website.boundary.dto.VacationDto;
import de.landblume_glindow.website.boundary.mapper.VacationDtoMapper;
import de.landblume_glindow.website.domain.port.input.VacationInputPort;
import lombok.RequiredArgsConstructor;

@Service
@Transactional
@RequiredArgsConstructor
public class VacationControllerService {
    private final VacationInputPort vacationInputPort;
    private final VacationDtoMapper vacationDtoMapper;

    public List<VacationDto> loadActiveVacations() {
        return vacationInputPort.loadActiveVacations().stream().map(vacationDtoMapper::toDto).toList();
    }
}
