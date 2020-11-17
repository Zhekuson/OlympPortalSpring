package com.nuclearfoxes.app;

import com.nuclearfoxes.Application;
import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringApplication;

class ApplicationTest {
    @Test
    void launchAppTest(){
        String[] args = new String[]{""};
        SpringApplication.run(Application.class,args);
    }
}