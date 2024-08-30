package com.dmcadieux.pinkelephants.Service;

import com.dmcadieux.pinkelephants.Entity.Snowflake;
import com.dmcadieux.pinkelephants.Repo.SnowflakeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SnowflakeService {

    private final SnowflakeRepository snowflakeRepository;

    @Autowired
    public SnowflakeService(SnowflakeRepository snowflakeRepository) {
        this.snowflakeRepository = snowflakeRepository;
    }

    public List<Snowflake> findAllSnowflakes() {
        return snowflakeRepository.findAll();
    }

    public List<Snowflake> findBySafeSpace(String safeSpace) {
        return snowflakeRepository.findBySafeSpace(safeSpace);
    }

}
