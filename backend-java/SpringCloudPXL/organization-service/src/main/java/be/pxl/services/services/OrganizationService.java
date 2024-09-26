package be.pxl.services.services;

import be.pxl.services.domain.Organization;
import be.pxl.services.repository.OrganizationRepository; // Assume this exists
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class OrganizationService implements IOrganizationService {

    private final OrganizationRepository organizationRepository;

    @Override
    public Organization findById(Long id) {
        Optional<Organization> organization = organizationRepository.findById(id);
        return organization.orElse(null);
    }

    @Override
    public Organization findByIdWithDepartments(Long id) {
        Optional<Organization> organization = organizationRepository.findByIdWithDepartments(id);
        return organization.orElse(null); // Handle Optional similarly
    }

    @Override
    public Organization findByIdWithDepartmentsAndEmployees(Long id) {
        Optional<Organization> organization = organizationRepository.findByIdWithDepartmentsAndEmployees(id);
        return organization.orElse(null); // Handle Optional similarly
    }

    @Override
    public Organization findByIdWithEmployees(Long id) {
        Optional<Organization> organization = organizationRepository.findByIdWithEmployees(id);
        return organization.orElse(null); // Handle Optional similarly
    }
}
