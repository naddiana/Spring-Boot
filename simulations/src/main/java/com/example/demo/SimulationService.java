package com.example.demo;
import org.springframework.stereotype.Service;
import com.github.javafaker.Faker;

import java.util.Date;
import java.util.ArrayList;
import java.util.Locale;
import java.util.UUID;


@Service
public class SimulationService {

    static ArrayList<Simulation> simulations = new ArrayList<>();

    // we will fill the list simulations
    // with fake objects simulation
    // we need the faker dependency
    // and then the loop will create and add one-by-one
    static {

        // locale in english
        Faker faker = new Faker(new Locale("en-GB"));
        Date date = new Date();

        // ref variable creation UUID
        String uniqueID;

        for (int i = 0; i <10 ; i++ ){

            uniqueID = UUID.randomUUID().toString();
            simulations.add(
                    new Simulation ( uniqueID,
                                     date.toString(),
                                    faker.number().numberBetween(100, 1250),
                            faker.artist().name() ));
        }

    }

    // return simulations to controller
    // get simulations form list static from class and return as signature
    public ArrayList<Simulation> getAllSimulations (){
        return simulations;
    }


}
