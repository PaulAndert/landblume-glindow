package de.landblume_glindow.website.domain.port.input;

import java.util.List;

import de.landblume_glindow.website.domain.model.Vacation;

public interface VacationInputPort {
    List<Vacation> loadActiveVacations();
}
