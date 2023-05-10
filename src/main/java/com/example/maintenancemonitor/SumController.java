package com.example.maintenancemonitor;

import org.springframework.web.bind.annotation.*;

public class SumController {

    @RequestMapping("/api/sum");
    public int sum(
                                    @RequestParam int a,
                                    @RequestParam int b){
        return a + b;
    }
}
