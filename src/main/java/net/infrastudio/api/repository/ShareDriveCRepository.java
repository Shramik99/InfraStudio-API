package net.infrastudio.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.infrastudio.api.model.ShareDriveCReport;

@Repository
public interface ShareDriveCRepository extends JpaRepository<ShareDriveCReport, Long>{

}
