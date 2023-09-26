package com.example.ms_job.services;

import com.example.ms_job.entities.Job;
import com.example.ms_job.repositories.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobService {

    @Autowired
    private JobRepository _jobRepository;

    public List<Job> allJobs(){
        return  this._jobRepository.findAll();
    }

    public Optional<Job> getJobByService(String service){
        return  this._jobRepository.findJobByService(service);
    }
    public Optional<Job> getJobById(int id){
        return  this._jobRepository.findById(id);
    }

    public Job updateJob(Job job , int id){
        Optional<Job> Job = this._jobRepository.findById(id);
        if((this._jobRepository.findById(id).isPresent()) && job.getEtat()){

        }

    }
}
