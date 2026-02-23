package de.landblume_glindow.website.domain.model;

import java.util.Date;

import lombok.Builder;

@Builder
public class Vacation {
    String title;
    String description;
    Date activFrom;
    Date activUntil;
}
