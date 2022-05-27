package net.infrastudio.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.infrastudio.api.model.URLConnectivityReport;

@Repository
public interface URLConnectivityRepository extends JpaRepository<URLConnectivityReport, Long>{

}
