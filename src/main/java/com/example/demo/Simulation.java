package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor @AllArgsConstructor
public class Simulation {

    private String id;
    private String createdAt;
    private int time;
    private String user;
}
