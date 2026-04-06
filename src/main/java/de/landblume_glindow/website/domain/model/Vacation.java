package de.landblume_glindow.website.domain.model;

import java.util.Date;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Vacation {
    String title;
    String description;
    Date activFrom;
    Date activUntil;
}
