package services;

import data.models.Candidate;
import data.models.Voter;
import data.repositories.VoterRepository;
import data.repositories.CandidateRepository;
import dtos.requests.LoginRequest;
import dtos.requests.ViewCandidatesRequest;
import dtos.responses.LoginResponse;
import dtos.responses.ViewCandidatesResponse;
import utils.CandidateMapper;
import utils.VoterMapper;
import java.util.List;

public class VoterServiceImplementation implements VoterService{
    private VoterRepository voterRepository;
    private CandidateRepository candidateRepository;

    public VoterServiceImplementation(VoterRepository voterRepository, CandidateRepository candidateRepository) {
        this.voterRepository = voterRepository;
        this.candidateRepository = candidateRepository;
    }
    @Override
    public List<ViewCandidatesResponse> viewCandidates(ViewCandidatesRequest request) {
        Voter voter = VoterMapper.mapToVoterViewCandidates(request);
        Voter existingVoter = voterRepository.findById(voter.getNationalId());
        if (existingVoter == null) {
            throw new RuntimeException("Voter not found");
        }
        if (!existingVoter.getPassword().equals(voter.getPassword())) {
            throw new RuntimeException("Invalid password");
        }
        if (!existingVoter.isRegistered()) {
            throw new RuntimeException("Voter is not registered");
        }
        List<Candidate> registeredCandidates = candidateRepository.findAll();
        return CandidateMapper.mapToCandidateResponseList(registeredCandidates);
    }
    @Override
    public LoginResponse login (LoginRequest request){
        Voter voter = VoterMapper.mapToVoterLogin(request);
        Voter existingVoter = voterRepository.findById(voter.getVoterId());
        if (existingVoter == null) {
            throw new RuntimeException("Voter not found");
        }
        if (!existingVoter.getPassword().equals(voter.getPassword())) {
            throw new RuntimeException("Invalid password");
        }
        if (!existingVoter.isRegistered()) {
            throw new RuntimeException("Voter is not registered");
        }

    }
}