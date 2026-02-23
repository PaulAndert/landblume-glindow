package de.landblume_glindow.website.store.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import de.landblume_glindow.website.store.entity.VacationEntity;

@Repository
public interface VacationRepository extends JpaRepository<VacationEntity, Long> {
    
    @Query("SELECT v FROM VacationEntity v WHERE v.activFrom <= now() AND v.activUntil >= now();")
    List<VacationEntity> loadActiveVacations();
}
