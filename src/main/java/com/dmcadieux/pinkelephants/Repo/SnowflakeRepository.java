package com.dmcadieux.pinkelephants.Repo;

import com.dmcadieux.pinkelephants.Entity.Snowflake;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SnowflakeRepository extends JpaRepository<Snowflake, Long> {

    List<Snowflake> findAll();

    List<Snowflake> findBySafeSpace(String safeSpace);

}
