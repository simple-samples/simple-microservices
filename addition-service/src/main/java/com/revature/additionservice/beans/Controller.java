package com.revature.additionservice.beans;

import com.revature.additionservice.Adder;
import com.revature.additionservice.numsDTO;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@EnableDiscoveryClient
@RestController
public class Controller {
/*
    {
        "nums":[1,2,3]
    }
*/

    public Controller() {

    }

    @PostMapping(value = "/add")
    @ResponseStatus(HttpStatus.OK)
    public Integer sumService(@RequestBody numsDTO nums) {
        System.out.print("adding numbers... ");
        for(Integer i : nums.getNums()) {
            System.out.print(i + " ");
        }
        System.out.println();

        return Adder.sum(nums.getNums());
    }

}
