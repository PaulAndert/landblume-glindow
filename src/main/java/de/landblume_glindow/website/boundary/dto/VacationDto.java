package de.landblume_glindow.website.boundary.dto;

import java.util.Date;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class VacationDto {
    String title;
    String description;
    Date activFrom;
    Date activUntil;
}
