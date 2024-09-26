package be.pxl.services.repository;

import be.pxl.services.domain.Department;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
    List<Department> findByOrganizationId(Long organizationId);

    // This method will depend on how you want to fetch departments with employees.
    List<Department> findByOrganizationIdWithEmployees(Long organizationId); // You may need a custom query for this
}
