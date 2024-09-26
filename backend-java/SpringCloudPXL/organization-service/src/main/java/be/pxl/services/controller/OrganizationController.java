package be.pxl.services.controller;

import be.pxl.services.domain.Organization;
import be.pxl.services.services.IOrganizationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/organization/")
@RequiredArgsConstructor
public class OrganizationController {

    private final IOrganizationService organizationService;

    @GetMapping("/{id}")
    public ResponseEntity<Organization> findById(@PathVariable Long id) {
        Organization organization = organizationService.findById(id);
        return organization != null ? new ResponseEntity<>(organization, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping("/{id}/with-departments")
    public ResponseEntity<Organization> findByIdWithDepartments(@PathVariable Long id) {
        Organization organization = organizationService.findByIdWithDepartments(id);
        return organization != null ? new ResponseEntity<>(organization, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping("/{id}/with-departments-and-employees")
    public ResponseEntity<Organization> findByIdWithDepartmentsAndEmployees(@PathVariable Long id) {
        Organization organization = organizationService.findByIdWithDepartmentsAndEmployees(id);
        return organization != null ? new ResponseEntity<>(organization, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping("/{id}/with-employees")
    public ResponseEntity<Organization> findByIdWithEmployees(@PathVariable Long id) {
        Organization organization = organizationService.findByIdWithEmployees(id);
        return organization != null ? new ResponseEntity<>(organization, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
