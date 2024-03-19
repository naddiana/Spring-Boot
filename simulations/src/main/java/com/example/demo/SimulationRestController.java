package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;

@RestController
public class SimulationRestController {

    @Autowired
    SimulationService simulationService;

    @RequestMapping("/hello")
    public String HelloWorld (){


        return "This is a sandbox for my first java class controller";

    }

    @RequestMapping("/banana")
    public String HelloBanana (){


        return "Here you have bananas array";

    }

    @RequestMapping("/simulations")
    public ArrayList<Simulation> getAllSimulations (){


        return simulationService.getAllSimulations();

    }

    @RequestMapping("/deleteSimulation/{id}")
    public ArrayList<Simulation> deleteSimulationById (){


        return simulationService.getAllSimulations();

    }

    @RequestMapping("/deleteSimulation/{user}")
    public ArrayList<Simulation> deleteSimulationByUser(){


        return simulationService.getAllSimulations();

    }




}
