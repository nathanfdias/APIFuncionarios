package br.org.serratec.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.org.serratec.model.Time;

public interface TimeRepository extends JpaRepository <Time, Long>{
    
}
