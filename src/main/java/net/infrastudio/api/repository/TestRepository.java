package net.infrastudio.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.infrastudio.api.model.Test;

@Repository
public interface TestRepository extends JpaRepository<Test, Long>{

}
