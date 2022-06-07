package com.neusoft.homework;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
@Slf4j
@SpringBootTest
class HomeworkApplicationTests {

    @Autowired
    JdbcTemplate jdbcTemplate;
    @Test
    void contextLoads() {
//        jdbcTemplate.queryForObject("select * from Reader");
//        jdbcTemplate.queryForList("select * from Reader");
        Long aLong = jdbcTemplate.queryForObject("select count(*) from reader", Long.class);
        log.info("记录总数：{}",aLong );

    }

}
