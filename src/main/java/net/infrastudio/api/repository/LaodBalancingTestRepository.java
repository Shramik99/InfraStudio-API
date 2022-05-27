package net.infrastudio.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.infrastudio.api.model.LoadBalancingTest;

@Repository
public interface LaodBalancingTestRepository extends JpaRepository<LoadBalancingTest, Long>{

}
