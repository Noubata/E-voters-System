package data.repositories;

import data.models.Voter;

public interface VoterRepository {
    long count();

    Voter save(Voter voter);
    void deleteById(int voter);
    Voter findById(int voter);
    boolean existsById(Integer voter);
}
