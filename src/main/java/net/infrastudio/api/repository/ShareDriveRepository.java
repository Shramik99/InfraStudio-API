package net.infrastudio.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import net.infrastudio.api.model.ShareDriveReport;

@Repository
public interface ShareDriveRepository extends JpaRepository<ShareDriveReport, Long> {
	
	@Query("SELECT td from share_drive_table td where td.uid=?1")
	public List<ShareDriveReport> getTestByUid(long uid);

}
