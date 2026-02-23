package de.landblume_glindow.website.store.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
@Entity
@Table(name = "vac_vacation")
public class VacationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "vac_id", nullable = false, unique = true)
    Long vacationId;

    @Column(name = "title")
    String title;

    @Column(name = "description")
    String description;

    @Column(name = "activ_from")
    Date activFrom;

    @Column(name = "activ_until")
    Date activUntil;
}
