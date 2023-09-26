package com.example.ms_job.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Job {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private  int id;

    private String service;

    private  Boolean etat;

    public Job() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public Boolean getEtat() {
        return etat;
    }

    public void setEtat(Boolean etat) {
        this.etat = etat;
    }

    @Override
    public String toString() {
        return "Job{" +
                "id=" + id +
                ", service='" + service + '\'' +
                ", etat=" + etat +
                '}';
    }
}
