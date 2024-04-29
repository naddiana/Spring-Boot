package repository;

import model.Simulation;
import org.springframework.data.repository.CrudRepository;

public interface SimulationRepository extends CrudRepository<Simulation, String> {
}
