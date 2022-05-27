package net.infrastudio.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import net.infrastudio.api.model.LoadBalancingReport;

@Repository
public interface LoadBalancingRepository extends JpaRepository<LoadBalancingReport, Long>{
	
	@Query("SELECT td from loadBalancing_table td where td.uid=?1")
	public List<LoadBalancingReport> getTestByUid(long uid);

}
