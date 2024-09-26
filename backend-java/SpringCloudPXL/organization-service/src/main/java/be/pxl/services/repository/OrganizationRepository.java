package be.pxl.services.repository;

import be.pxl.services.domain.Organization;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface OrganizationRepository extends JpaRepository<Organization, Long> {

    Optional<Organization> findByIdWithDepartments(@Param("id") Long id);
    Optional<Organization> findByIdWithDepartmentsAndEmployees(@Param("id") Long id);
    Optional<Organization> findByIdWithEmployees(@Param("id") Long id);
}
