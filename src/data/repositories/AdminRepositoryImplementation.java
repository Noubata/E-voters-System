package data.repositories;

import data.models.Admin;

import java.util.ArrayList;
import java.util.List;

public class AdminRepositoryImplementation implements AdminRepository{

    private List<Admin> admins = new ArrayList<>();

    @Override
    public long count(){
        return 0;
    }
    @Override
    public Admin save(Admin admin){
        if (isNew(admin)) saveNew(admin); else update(admin);
            return admin;
    }

    private void saveNew(Admin admin) {

    }

    private boolean isNew(Admin admin) {
        for (Admin checkAdmin: admins){
            if (!admins.contains(admin)){
                admin.getPhoneNumber();
            }
        }
        return true;
    }

    private void update(Admin admin){

    }
}
