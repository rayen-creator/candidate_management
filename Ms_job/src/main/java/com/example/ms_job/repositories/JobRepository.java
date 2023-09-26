package com.example.ms_job.repositories;

import com.example.ms_job.entities.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface JobRepository extends JpaRepository<Job,Integer> {

    public Optional<Job> findJobByService(String service);
}
