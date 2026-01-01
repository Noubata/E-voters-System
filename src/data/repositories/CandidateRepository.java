package data.repositories;

import data.models.Candidate;

public interface CandidateRepository {

    Candidate save(Candidate candidate);

    long count();

    void deleteById(int id);

    Candidate findById(int id);

    boolean existsById(Integer voter);
}
