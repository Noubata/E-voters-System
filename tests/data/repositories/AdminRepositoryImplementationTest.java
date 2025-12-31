package data.repositories;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AdminRepositoryImplementationTest {
    @Test
    public void testThatCreateRepositoryAndItIsEmpty() {
        AdminRepositoryImplementation adminRepo = new AdminRepositoryImplementation();
        assertEquals(0, adminRepo.count());
    }
}