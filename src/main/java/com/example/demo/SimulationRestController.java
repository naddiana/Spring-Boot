package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/simulation/")
public class SimulationRestController {

    @Autowired
    SimulationService simulationService;

    @Autowired
    SimulationRepository simulationRepository;

    @RequestMapping("/simulations")
    public Iterable<Simulation> getAllSimulations (){


        return simulationService.getAllSimulations();

    }
    @RequestMapping("/populate")
    public String populateDB() {


        simulationService.populate();

        return "ok";
    }
    @DeleteMapping
    public String deleteSimulation(@RequestParam String id) {

        //System.out.println("id:" + id);
        Optional<Simulation> simulationFound = simulationRepository.findById(id);

        //System.out.println("simulationFound:" + simulationFound);

        if (simulationFound.isPresent()){
            simulationRepository.deleteById(id);
            String response = "simulation deleted: " + id;
            return response;
        } else return "id not found";

    }
}
