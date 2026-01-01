package data.repositories;

import data.models.Candidate;
import data.models.Voter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CandidateRepositoryImplementationTest {
    @Test
    public void testThatCreateRepositoryAndItIsEmpty() {
        CandidateRepositoryImplementation candidateRepo = new CandidateRepositoryImplementation();
        assertEquals(0, candidateRepo.count());
    }
    @Test
    public void testThatCreateRepositoryAddVoterCountOne(){
        CandidateRepositoryImplementation candidateRepo = new CandidateRepositoryImplementation();
        assertEquals(0, candidateRepo.count());
        Candidate candidate = new Candidate();
        candidateRepo.save(candidate);
        assertEquals(1,candidateRepo.size());
    }
    @Test
    public void testThatAddVoterDeleteById(){
        CandidateRepositoryImplementation candidateRepo = new CandidateRepositoryImplementation();
        assertEquals(0, candidateRepo.count());
        Candidate candidate = new Candidate();
        candidateRepo.save(candidate);
        assertEquals(1,candidateRepo.size());
        candidateRepo.deleteById(1);
        assertEquals(0,candidateRepo.size());
    }
    @Test
    public void testThatFindVoterByTheId(){
        CandidateRepositoryImplementation candidateRepo = new CandidateRepositoryImplementation();
        assertEquals(0, candidateRepo.count());
        Candidate candidate = new Candidate();
        candidateRepo.save(candidate);
        assertEquals(1,candidateRepo.size());
        Candidate foundCandidate = candidateRepo.findById(1);
        assertNotNull(foundCandidate);
    }
    @Test
    public void testThatAddVoter_checkItExistsById(){
        CandidateRepositoryImplementation candidateRepo = new CandidateRepositoryImplementation();
        assertEquals(0, candidateRepo.count());
        Candidate candidate = new Candidate();
        candidateRepo.save(candidate);
        assertEquals(1,candidateRepo.size());
        assertTrue(candidateRepo.existsById(candidate.getCandidateId()));
    }
}
