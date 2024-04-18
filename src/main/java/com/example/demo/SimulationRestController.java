package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;

@RestController
@RequestMapping("/api/v1/simulation/")
public class SimulationRestController {

    @Autowired
    SimulationService simulationService;


    @RequestMapping("/simulations")
    public Iterable<Simulation> getAllSimulations (){


        return simulationService.getAllSimulations();

    }
    @RequestMapping("/populate")
    public String populateDB() {


        simulationService.populate();

        return "ok";
    }

}
