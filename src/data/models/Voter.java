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
