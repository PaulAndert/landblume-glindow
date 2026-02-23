package de.landblume_glindow.website.domain.usecase;

import java.util.List;

import de.landblume_glindow.website.domain.model.Vacation;
import de.landblume_glindow.website.domain.port.input.VacationInputPort;
import de.landblume_glindow.website.domain.port.output.VacationOutputPort;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class VacationInputPortAdapter implements VacationInputPort {
    private final VacationOutputPort vacationOutputPort;

    @Override
    public List<Vacation> loadActiveVacations() {
        return vacationOutputPort.loadActiveVacations();
    }
    
}
