package com.mlbstats.baseball_stats.pitcher_entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
@Table(name = "pitcher_stats")
public class Pitcher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // automatically generate ID since my csv doesnt have one
    private Integer id;
    private String lastName;
    private String firstName;
    private Integer playerId;
    private Integer year;
    private Integer pa;
    private Double kPercent;
    private Double bbPercent;
    private Double wOBA;
    private Double xWOBA;
    private Double sweetSpotPercent;
    private Double barrelBattedRate;
    private Double hardHitPercent;
    private Double avgBestSpeed;
    private Double avgHyperSpeed;
    private Double whiffPercent;
    private Double swingPercent;

    private Pitcher() {}

    public Pitcher(String lastName, String firstName, Integer playerId, Integer year, Integer pa, Double kPercent, Double bbPercent, Double wOBA, Double xWOBA, Double sweetSpotPercent, Double barrelBattedRate, Double hardHitPercent, Double avgBestSpeed, Double avgHyperSpeed, Double whiffPercent, Double swingPercent) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.playerId = playerId;
        this.year = year;
        this.pa = pa;
        this.kPercent = kPercent;
        this.bbPercent = bbPercent;
        this.wOBA = wOBA;
        this.xWOBA = xWOBA;
        this.sweetSpotPercent = sweetSpotPercent;
        this.barrelBattedRate = barrelBattedRate;
        this.hardHitPercent = hardHitPercent;
        this.avgBestSpeed = avgBestSpeed;
        this.avgHyperSpeed = avgHyperSpeed;
        this.whiffPercent = whiffPercent;
        this.swingPercent = swingPercent;
    }

    public String getLastName() {
        return this.lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirsttName() {
        return this.firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Integer getPlayerId() {
        return this.playerId;
    }
    
    public void setPlayerId(Integer playerID) {
        this.playerId = playerId;
    }

    public Integer getPitcherYear() {
        return this.year;
    }

    public void setPitcherYear(Integer year) {
        this.year = year;
    }

    public Integer getPlateAppearances() {
        return this.pa;
    }

    public void setPlateAppearances(Integer pa) {
        this.pa = pa;
    }

    public Double getKPercent() {
        return this.kPercent;
    }

    public void setKPercent(Double kPercent) {
        this.kPercent = kPercent;
    }
    
    public Double getBBPercent() {
        return this.bbPercent;
    }

    public void setBBPercent(Double bbPercent) {
        this.bbPercent = bbPercent;
    }

    public Double getWOBA() {
        return this.wOBA;
    }

    public void setWOBA(Double wOBA) {
        this.wOBA = wOBA;
    }

    public Double getXWOBA() {
        return this.xWOBA;
    }

    public void setXWOBA(Double xWOBA) {
        this.xWOBA = xWOBA;
    }

    public Double getSweetSpotPercent() {
        return this.sweetSpotPercent;
    }

    public void setSweetSpotPercent(Double sweetSpotPercent) {
        this.sweetSpotPercent = sweetSpotPercent;
    }

    public Double getBarrelBattedRat() {
        return this.barrelBattedRate;
    }

    public void setBarrelBattedRat(Double barrelBattedRate) {
        this.barrelBattedRate = barrelBattedRate;
    }

    public Double getHardHitPercent() {
        return this.hardHitPercent;
    }

    public void setHardHitPercent(Double hardHitPercent) {
        this.hardHitPercent = hardHitPercent;
    }

    public Double getAvgBestSpeed() {
        return this.avgBestSpeed;
    }

    public void setAvgBestSpeed(Double avgBestSpeed) {
        this.avgBestSpeed = avgBestSpeed;
    }
    
    public Double getAvgHyperSpeed() {
        return this.avgHyperSpeed;
    }

    public void setAvgHyperSpeed(Double avgHyperSpeed) {
        this.avgHyperSpeed = avgHyperSpeed;
    }

    public Double getWhiffPercent() {
        return this.whiffPercent;
    }

    public void setWhiffPercent(Double whiffPercent) {
        this.whiffPercent = whiffPercent;
    }

    public Double getSwingPercent() {
        return this.swingPercent;
    }

    public void setSwingPercent(Double swingPercent) {
        this.swingPercent = swingPercent;
    }
}

