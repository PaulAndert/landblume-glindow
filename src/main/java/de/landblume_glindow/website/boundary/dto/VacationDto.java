package de.landblume_glindow.website.boundary.dto;

import java.util.Date;

import lombok.Builder;

@Builder
public class VacationDto {
    String title;
    String description;
    Date activFrom;
    Date activUntil;
}
