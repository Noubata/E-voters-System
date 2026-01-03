package dtos.requests;

public class CheckEligibilityRequest {
    private int age;
    private int nationalId;
    private boolean isRegistered;


    public CheckEligibilityRequest(int nationalId, int age, boolean isRegistered) {
        this.nationalId = nationalId;
        this.age = age;
        this.isRegistered = isRegistered;
    }


    public int getNationalId() {
        return nationalId;
    }

    public void setNationalId(int nationalId) {
        this.nationalId = nationalId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isRegistered() {
        return isRegistered;
    }

    public void setRegistered(boolean registered) {
        isRegistered = registered;
    }
}