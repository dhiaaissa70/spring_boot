package com.esprit.dhiaaissa4sim1.repository;
import com.esprit.dhiaaissa4sim1.entities.Bloc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface BlocRepository extends JpaRepository<Bloc, Long> {

}
