package com.mlbstats.baseball_stats.service;

import org.springframework.stereotype.Component;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Optional;

import com.mlbstats.baseball_stats.repository.PitcherRepository;
import com.mlbstats.baseball_stats.entity.Pitcher;

@Component
public class PitcherService {
    private final PitcherRepository pitcherRepository;

    @Autowired
    public PitcherService(PitcherRepository pitcherRepository) {
        this.pitcherRepository = pitcherRepository;
    }

    // return all pitchers
    public List<Pitcher> getPitchers() {
        return pitcherRepository.findAll();
    }
}