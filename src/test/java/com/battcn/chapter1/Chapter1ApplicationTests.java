package com.battcn.chapter1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Chapter1ApplicationTests {
    Logger logger = LoggerFactory.getLogger(this.getClass());
    @Test
    public void contextLoads() {
        logger.debug("hahhaa ");
    }

}
