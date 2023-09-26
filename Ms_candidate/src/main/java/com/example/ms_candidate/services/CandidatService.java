package com.example.ms_candidate.services;

import com.example.ms_candidate.entites.Candidat;
import com.example.ms_candidate.repositories.CandidatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service()
public class CandidatService {

    @Autowired()
    private CandidatRepository candidatRepository;

    public Candidat addCandidat(Candidat candidat){
        return this.candidatRepository.save((candidat));
    }

    public Candidat updateCandidat(Candidat newcandidat,int id){
        if(this.candidatRepository.findById(id).isPresent()){
            Candidat existingCandidat=this.candidatRepository.findById(id).get();
            existingCandidat.setNom(newcandidat.getNom());
            existingCandidat.setEmail(newcandidat.getEmail());
            existingCandidat.setPrenom(newcandidat.getPrenom());
        return this.candidatRepository.save(existingCandidat);
        }else{
            return null;
        }
    }

    public String delete(int id){
        if(this.candidatRepository.findById(id).isPresent()){
            this.candidatRepository.deleteById(id);
            return "candidat supprimé";
        }else{
            return "candidat non supprimé";
        }
    }

}
