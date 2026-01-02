package data.repositories;

import data.models.Voter;

import java.util.ArrayList;
import java.util.List;

public class VoterRepositoryImplementation implements VoterRepository{

    private List<Voter> voters = new ArrayList<>();
    private int count = 0;

    @Override
    public long count(){
        return 0;
    }
    @Override
    public Voter findById(int id){
        for (Voter theVoter: voters){
            if (theVoter.getNationalId() == id){
                return theVoter;
            }
        }
        return null;
    }
    @Override
    public void deleteById(int id){
        voters.remove(findById(id));
    }
    @Override
    public Voter save(Voter voter) {
        if (isNew(voter)) {
            saveNew(voter);
        } else {
            update(voter);
        }
        return voter;
    }


    private boolean isNew(Voter voter) {
        return voter.getNationalId() == 0;
    }
    private void saveNew(Voter voter) {
        count++;
        voter.setNationalId(count);
        voters.add(voter);
    }

    private void update(Voter voter) {
        deleteById(voter.getNationalId());
        voters.add(voter);
    }

    public int size() {
        return voters.size();
    }
    @Override
    public boolean existsById(Integer voter) {
        if (voter == null) {
            throw new IllegalArgumentException("ID can't be null");
        }
        for (Voter myVoter : voters) {
            if (myVoter.getNationalId() == voter) {
                return true;
            }
        }
        return false;
    }

}
