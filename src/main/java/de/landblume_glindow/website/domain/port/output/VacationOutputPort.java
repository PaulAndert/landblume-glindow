package de.landblume_glindow.website.domain.port.output;

import java.util.List;

import de.landblume_glindow.website.domain.model.Vacation;

public interface VacationOutputPort {

    List<Vacation> loadActiveVacations();
    
}
