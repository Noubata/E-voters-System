package data.repositories;

import data.models.Candidate;

import java.util.ArrayList;
import java.util.List;

public class CandidateRepositoryImplementation implements CandidateRepository{

    List<Candidate> candidates = new ArrayList<>();
    private int count= 0;
    @Override
    public long count() {
        return 0;
    }
    @Override
    public Candidate save(Candidate candidate){
        if (isNew(candidate)) {
            saveNew(candidate);
        } else {
            update(candidate);
        }
        return candidate;
    }
    private boolean isNew(Candidate candidate) {
        return candidate.getCandidateId() == 0;
    }
    private void saveNew(Candidate candidate) {
        count++;
        candidate.setCandidateId(count);
        candidates.add(candidate);
    }

    private void update(Candidate candidate) {
        deleteById(candidate.getCandidateId());
        candidates.add(candidate);
    }
    @Override
    public void deleteById(int id){
        candidates.remove(findById(id));
    }
    @Override
    public Candidate findById(int id){
        for (Candidate theCandidate: candidates){
            if (theCandidate.getCandidateId() == id){
                return theCandidate;
            }
        }
        return null;
    }
    @Override
    public boolean existsById(Integer voter) {
        if (voter == null) {
            throw new IllegalArgumentException("ID can't be null");
        }
        for (Candidate myVoter : candidates) {
            if (myVoter.getCandidateId() == voter) {
                return true;
            }
        }
        return false;
    }

    public int size() {
        return candidates.size();
    }
}
