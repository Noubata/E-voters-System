package services;

import data.models.Candidate;
import data.models.Voter;
import data.repositories.VoterRepository;
import data.repositories.CandidateRepository;
import dtos.requests.CheckEligibilityRequest;
import dtos.requests.LoginRequest;
import dtos.requests.ViewCandidatesRequest;
import dtos.requests.VoteCandidateRequest;
import dtos.responses.*;
import utils.CandidateMapper;
import utils.ResultMapper;
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
        boolean hasVoted  = voterRepository.existsById(voter.getVoterId());
        return VoterMapper.mapToLoginResponse(existingVoter, hasVoted);
    }
    @Override
    public ResultResponse viewResults(){
        List<Candidate> allCandidates = candidateRepository.findAll();
        List<Voter> allVoters = voterRepository.findAllWhoVoted();
        return ResultMapper.mapToResultResponse(allCandidates, allVoters);
    }
    @Override
    public CheckEligibilityResponse eligibility(CheckEligibilityRequest request){
        Voter voter = VoterMapper.mapToEligibilityResponse(request);
        Voter eligibleVoter = voterRepository.findById(voter.getNationalId());
        if (voter == null) {
            return new CheckEligibilityResponse(false, "Voter not found or National ID not registered");
        }
        boolean hasVoted = voterRepository.hasVoterVoted(voter.getNationalId());
        boolean isEligible = voter.isRegistered() && voter.getAge() >=18 && hasVoted;
        String message;

        if (isEligible) {
            message = "Voter is eligible to vote";
        } else if (!voter.isRegistered()) {
            message = "Not eligible";
        } else if (voter.getAge() < 18) {
            message = "Not eligible";
        } else if (hasVoted) {
            message = "Not eligible";
        } else {
            message = "Not eligible";
        }
        return new CheckEligibilityResponse(isEligible, message);
    }
    @Override
    public VoteCandidateResponse voteCandidate(VoteCandidateRequest request) {

        Voter voter = voterRepository.findById(request.getVoterId());

        if (voter == null) {
            return VoterMapper.mapToVoteCandidateResponse(false, "Voter not found");
        }

        if (!voter.isRegistered()) {
            return VoterMapper.mapToVoteCandidateResponse(false, "Voter is not registered");
        }

        boolean hasVoted = voterRepository.hasVoterVoted(voter.getNationalId());
        if (hasVoted) {
            return VoterMapper.mapToVoteCandidateResponse(false, "You have already voted");
        }

        if (voter.getAge() < 18) {
            return VoterMapper.mapToVoteCandidateResponse(false, "You are not eligible to vote - must be 18 or older");
        }

        Candidate candidate = candidateRepository.findById(request.getCandidateId());
        if (candidate == null) {
            return VoterMapper.mapToVoteCandidateResponse(false, "Candidate not found");
        }

        Voter vote = VoterMapper.mapToVote(voter, request);
        voterRepository.save(vote);

        return new VoteCandidateResponse(true, "Vote cast successfully");
    }
}