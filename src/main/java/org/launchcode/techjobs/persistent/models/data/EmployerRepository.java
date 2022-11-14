package org.launchcode.techjobs.persistent.models.data;

import org.launchcode.techjobs.persistent.models.Employer;

import java.util.Optional;

public interface EmployerRepository {
    Object findAll();

    void save(Employer newEmployer);

    Optional<Employer> findById(int employerId);
}
