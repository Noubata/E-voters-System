package services;

import dtos.requests.CheckEligibilityRequest;
import dtos.requests.LoginRequest;
import dtos.requests.ViewCandidatesRequest;
import dtos.requests.VoteCandidateRequest;
import dtos.responses.*;

import java.util.List;

public interface VoterService {
    List<ViewCandidatesResponse> viewCandidates(ViewCandidatesRequest request);
    LoginResponse login (LoginRequest request);
    ResultResponse viewResults();
    CheckEligibilityResponse eligibility (CheckEligibilityRequest request);
    VoteCandidateResponse voteCandidate (VoteCandidateRequest request);
}
