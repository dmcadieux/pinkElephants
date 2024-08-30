package com.dmcadieux.pinkelephants.Controller;

import com.dmcadieux.pinkelephants.Entity.Snowflake;
import com.dmcadieux.pinkelephants.Service.SnowflakeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SnowflakeController {

    private final SnowflakeService snowflakeService;

    @Autowired
    public SnowflakeController(SnowflakeService snowflakeService) {
        this.snowflakeService = snowflakeService;
    }


    @GetMapping("/get")
    public List<Snowflake> getAllSnowflakes() {
        return snowflakeService.findAllSnowflakes();
    }

    // query formation example getbysafespace?safeSpace=my+room
    @GetMapping("/getbysafespace")
    public List<Snowflake> getAllSnowflakesBySafespace(@RequestParam String safeSpace) {
        return snowflakeService.findBySafeSpace(safeSpace);
    }

}
