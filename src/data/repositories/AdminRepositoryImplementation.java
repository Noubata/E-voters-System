package data.repositories;

import data.models.Admin;

    import java.util.ArrayList;
    import java.util.List;


public class AdminRepositoryImplementation implements AdminRepository{

    private List<Admin> admins = new ArrayList<>();
    private int countSize;
    @Override
    public long count(){
        return 0;
    }

}
