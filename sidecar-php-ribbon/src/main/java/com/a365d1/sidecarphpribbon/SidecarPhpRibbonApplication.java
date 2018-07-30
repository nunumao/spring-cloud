package com.a365d1.sidecarphpribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.sidecar.EnableSidecar;

@SpringBootApplication
@EnableSidecar
public class SidecarPhpRibbonApplication {

    public static void main(String[] args) {
        SpringApplication.run(SidecarPhpRibbonApplication.class, args);
    }
}
