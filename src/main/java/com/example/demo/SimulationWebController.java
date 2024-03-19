package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class SimulationWebController {

    @Autowired
    SimulationService simulationService;

    @RequestMapping("/home")
    public String simulationsHome (Model simulationData ){

        simulationData.addAttribute("simulationDataController",
                simulationService.getAllSimulations());
        simulationData.addAttribute("name", "Diana");


        return "simulations.html";
    }
}
