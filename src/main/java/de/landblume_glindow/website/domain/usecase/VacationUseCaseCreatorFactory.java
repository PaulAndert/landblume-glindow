package de.landblume_glindow.website.domain.usecase;

import de.landblume_glindow.website.domain.port.input.VacationInputPort;
import de.landblume_glindow.website.domain.port.output.VacationOutputPort;

public final class VacationUseCaseCreatorFactory {
    private VacationUseCaseCreatorFactory() {}

    public static VacationInputPort createVacationInputPort(VacationOutputPort vacationOutputPort) {
        return new VacationInputPortAdapter(vacationOutputPort);
    }
}
