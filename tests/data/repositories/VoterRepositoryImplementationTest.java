package data.repositories;

import data.models.Voter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class VoterRepositoryImplementationTest {
    @Test
    public void testThatCreateRepositoryAndItIsEmpty() {
        VoterRepositoryImplementation voterRepo = new VoterRepositoryImplementation();
        assertEquals(0, voterRepo.count());
    }
    @Test
    public void testThatCreateRepositoryAddVoterCountOne(){
        VoterRepositoryImplementation voterRepo = new VoterRepositoryImplementation();
        assertEquals(0, voterRepo.count());
        Voter voter = new Voter();
        voterRepo.save(voter);
        assertEquals(1,voterRepo.size());
    }
    @Test
    public void testThatAddVoterDeleteById(){
        VoterRepositoryImplementation voterRepo = new VoterRepositoryImplementation();
        assertEquals(0, voterRepo.count());
        Voter voter = new Voter();
        voterRepo.save(voter);
        assertEquals(1,voterRepo.size());
        voterRepo.deleteById(1);
        assertEquals(0,voterRepo.size());
    }
    @Test
    public void testThatFindVoterByTheId(){
        VoterRepositoryImplementation voterRepo = new VoterRepositoryImplementation();
        assertEquals(0, voterRepo.count());
        Voter voter = new Voter();
        voterRepo.save(voter);
        assertEquals(1,voterRepo.size());
        Voter foundVoter = voterRepo.findById(1);
        assertNotNull(foundVoter);
    }
    @Test
    public void testThatAddVoter_checkItExistsById(){
        VoterRepositoryImplementation voterRepo = new VoterRepositoryImplementation();
        assertEquals(0, voterRepo.count());
        Voter voter = new Voter();
        voterRepo.save(voter);
        assertEquals(1,voterRepo.size());
        assertTrue(voterRepo.existsById(voter.getId()));
    }
}
