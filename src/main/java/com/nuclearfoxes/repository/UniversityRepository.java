package com.nuclearfoxes.repository;

import com.nuclearfoxes.models.University;
import com.nuclearfoxes.models.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface UniversityRepository  extends Repository<University,Integer> {
    @Query(nativeQuery = true, value = "SELECT * FROM university")
    List<University> getAllUniversities();

    @Query(nativeQuery = true, value = "SELECT * FROM university u WHERE u.id = :id")
    University getUniversityById(int id);
}
