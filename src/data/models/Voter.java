package data.models;

public class Voter {
    private String name;
    private int nationalId;
    private int age;
    private String state;
    private String address;
    private boolean isRegistered;
    private String password;
    private int voterId;
    private Integer candidateId;
    private boolean hasVoted;
    private String email;
    private String phone;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public boolean isHasVoted() {
        return hasVoted;
    }

    public void setHasVoted(boolean hasVoted) {
        this.hasVoted = hasVoted;
    }

    public Integer getCandidateId(){
        return candidateId;
    }
    public void setCandidateId(Integer candidateId){
        this.candidateId = candidateId;
    }
    public boolean isRegistered() {
        return isRegistered;
    }

    public void setRegistered(boolean registered) {
        isRegistered = registered;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNationalId() {
        return nationalId;
    }

    public void setNationalId(int id) {
        this.nationalId = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getVoterId() {
        return voterId;
    }
    public void setVoterId(int voterId){
        this.voterId = voterId;
    }
}
