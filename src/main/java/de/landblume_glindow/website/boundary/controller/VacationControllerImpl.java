package de.landblume_glindow.website.boundary.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import de.landblume_glindow.website.boundary.dto.VacationDto;
import de.landblume_glindow.website.boundary.endpoints.VacationEndpoints;
import de.landblume_glindow.website.boundary.service.VacationControllerService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(VacationEndpoints.VACATION_BASE)
@RequiredArgsConstructor
public class VacationControllerImpl implements VacationController {
    private final VacationControllerService vacationControllerService;

    @Override
    public ResponseEntity<List<VacationDto>> loadActiveVacations() {
        return ResponseEntity.ok(vacationControllerService.loadActiveVacations());
    }
    
    
}
