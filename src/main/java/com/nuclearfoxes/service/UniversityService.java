package com.nuclearfoxes.service;

import com.nuclearfoxes.models.University;
import com.nuclearfoxes.repository.UniversityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UniversityService {

    private final UniversityRepository universityRepository;

    @Autowired
    public UniversityService(UniversityRepository universityRepository){
        this.universityRepository = universityRepository;
    }

    public List<University> getAll(){
        return universityRepository.getAllUniversities();
    }
}
