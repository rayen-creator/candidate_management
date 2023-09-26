package com.example.ms_job.controllers;


import com.example.ms_job.entities.Job;
import com.example.ms_job.services.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/api/job")
public class JobController {

    @Autowired
    private JobService _jobservice;


    @GetMapping()
    public List<Job> AllJobs(){
        return  this._jobservice.allJobs();
    }
    @GetMapping("getJobByid/{id}")
    public Optional<Job> JobById(@PathVariable("id") int id){
        return  this._jobservice.getJobById(id);
    }

    @GetMapping("getJobByService/{id}")
    public Optional<Job> JobByService(String service){
        return  this._jobservice.getJobByService(service);
    }
}
