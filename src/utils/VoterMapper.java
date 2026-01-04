package utils;

import data.models.Voter;
import dtos.requests.*;
import dtos.responses.*;

public class VoterMapper {
    public static Voter mapToVoterViewCandidates(ViewCandidatesRequest viewCandidatesRequest)  {
        Voter voter = new Voter();
        voter.setNationalId(viewCandidatesRequest.getVoterId());
        voter.setPassword(viewCandidatesRequest.getPassword());
        voter.setRegistered(viewCandidatesRequest.isRegistered());
        return voter;
    }
    public static Voter mapToVoterLogin(LoginRequest loginRequest){
        Voter voter = new Voter();
        voter.setNationalId(loginRequest.getVoterId());
        voter.setPassword(loginRequest.getPassword());
        return voter;
    }
    public static LoginResponse mapToLoginResponse(Voter voter, boolean hasVoted) {
        LoginResponse response = new LoginResponse();
        response.setVoterId(voter.getVoterId());
        response.setVoterName(voter.getName());
        response.setHasVoted(hasVoted);
        return response;
    }

    public static Voter mapToEligibilityResponse(CheckEligibilityRequest request) {
        Voter voter = new Voter();
        voter.setAge(voter.getNationalId());
        voter.setRegistered(voter.isRegistered());
        return  voter;
    }
    public static VoteCandidateResponse mapToVoteCandidateResponse(boolean success, String message) {
        VoteCandidateResponse response = new VoteCandidateResponse();
        response.setSuccess(success);
        response.setMessage(message);
        return response;
    }
    public static Voter mapToVote(Voter voter, VoteCandidateRequest request) {
        Voter vote = new Voter();
        vote.setVoterId((int) System.currentTimeMillis());
        vote.setNationalId(voter.getNationalId());
        vote.setCandidateId(request.getCandidateId());
        return vote;
    }
    public static Voter mapToVoter(int voterId, CreateAccountRequest request) {
        Voter voter = new Voter();
        voter.setVoterId(voterId);
        voter.setName(request.getFullName());
        voter.setPassword(request.getPassword());
        return voter;
    }

    public static CreateAccountResponse mapToCreateAccountResponse(int voterId, String fullName, String password) {
        CreateAccountResponse response = new CreateAccountResponse(voterId, fullName, password);
        response.setVoterName(fullName);
        response.setPassword(password);
        response.setVoterId(voterId);
        return response;
    }

    public static Voter mapToVoter(EditUserProfileRequest request) {
        Voter vote = new Voter();
        vote.setPassword(request.getPassword());
        vote.setName(request.getFullName());
        vote.setAddress(request.getAddress());
        vote.setState(request.getState());
        vote.setEmail(request.getEmail());
        vote.setPhone(request.getPhone());
        vote.setAge(request.getAge());
        return vote;
    }
    public static EditUserProfileResponse mapToEditUserProfileResponse(String password, String address, String email, String name, String phone, String state, int age) {
        EditUserProfileResponse response = new EditUserProfileResponse();
        response.setPassword(password);
        response.setAddress(address);
        response.setEmail(email);
        response.setName(name);
        response.setPhone(phone);
        response.setState(state);
        response.setAge(age);
        return response;
    }
    public static DeleteUserResponse mapToDeleteUserResponse(int voterId, String name) {
        DeleteUserResponse response = new DeleteUserResponse();
        response.setVoterId(voterId);
        response.setVoterName(name);
        response.setMessage("Account successfully deleted");
        return response;
    }
}
