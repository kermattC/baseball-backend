package com.mlbstats.baseball_stats.repository;

import org.springframework.stereotype.Component;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mlbstats.baseball_stats.entity.Pitcher;

// get CRUD operations from JPA as well as any data access logic (interacting with db)
// extending jpa repository gives access to a bunch of methods for interacting with data
public interface PitcherRepository extends JpaRepository<Pitcher, Integer> {

}