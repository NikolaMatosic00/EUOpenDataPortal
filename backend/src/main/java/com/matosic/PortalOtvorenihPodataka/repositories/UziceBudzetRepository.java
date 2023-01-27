package com.matosic.PortalOtvorenihPodataka.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.matosic.PortalOtvorenihPodataka.models.UziceBudzet;

@Repository
public interface UziceBudzetRepository extends JpaRepository<UziceBudzet, Integer>{

}
