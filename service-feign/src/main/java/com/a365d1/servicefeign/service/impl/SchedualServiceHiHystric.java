package com.a365d1.servicefeign.service.impl;

import com.a365d1.servicefeign.service.SchedualServiceHi;
import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {


    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry " + name;
    }


}
