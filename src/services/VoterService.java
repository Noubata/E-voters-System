package services;

import dtos.requests.*;
import dtos.responses.*;

import java.util.List;

public interface VoterService {
    List<ViewCandidatesResponse> viewCandidates(ViewCandidatesRequest request);
    LoginResponse login (LoginRequest request);
    ResultResponse viewResults();
    CheckEligibilityResponse eligibility (CheckEligibilityRequest request);
    VoteCandidateResponse voteCandidate (VoteCandidateRequest request);
    CreateAccountResponse createAccount (CreateAccountRequest request);
}
