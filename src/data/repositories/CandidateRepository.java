package data.repositories;

import data.models.Candidate;

import java.util.List;

public interface CandidateRepository {

    Candidate save(Candidate candidate);

    long count();

    void deleteById(int id);

    Candidate findById(int id);

    boolean existsById(Integer voter);

    List<Candidate> findAll();
}
