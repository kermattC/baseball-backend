package com.mlbstats.baseball_stats.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

import com.mlbstats.baseball_stats.entity.Pitcher;
import com.mlbstats.baseball_stats.service.PitcherService;
import com.mlbstats.baseball_stats.repository.PitcherRepository;

@RestController
@RequestMapping(path="api/v1/pitcher")
public class PitcherController {
    private final PitcherService pitcherService;

    @Autowired
    public PitcherController(PitcherService pitcherService) {
        this.pitcherService = pitcherService;
    }

    @GetMapping
    public List<Pitcher> getPitchers() {
        return pitcherService.getPitchers();
    }
}