import data.models.Admin;
import data.repositories.AdminRepository;
import data.repositories.AdminRepositoryImplementation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AdminRepositoryImplementationTest {
    @Test
    public void testThatCreateRepositoryAndItIsEmpty(){
        AdminRepositoryImplementation adminRepo = new AdminRepositoryImplementation();
        assertEquals(0,adminRepo.count());
    }
    @Test
    public void testThatCreateRepositoryAddOneUser(){
        AdminRepositoryImplementation adminRepo = new AdminRepositoryImplementation();
        assertEquals(0,adminRepo.count());
        Admin admin = new Admin();
        adminRepo.save(admin);
    }
}