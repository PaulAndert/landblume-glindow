package de.landblume_glindow.website.boundary.configurator;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import de.landblume_glindow.website.domain.port.input.VacationInputPort;
import de.landblume_glindow.website.domain.port.output.VacationOutputPort;
import de.landblume_glindow.website.domain.usecase.VacationUseCaseCreatorFactory;

@Configuration
public class VacationUseCaseConfigurator {
    
    @Bean
    public VacationInputPort vacationInputPort(VacationOutputPort vacationOutputPort) {
        return VacationUseCaseCreatorFactory.createVacationInputPort(vacationOutputPort);
    }
}
