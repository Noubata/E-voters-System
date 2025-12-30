package data.repositories;

import data.models.Admin;

public interface AdminRepository {

    long count();

    Admin save(Admin admin);
}
