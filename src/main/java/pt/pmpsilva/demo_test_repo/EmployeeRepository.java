package pt.pmpsilva.demo_test_repo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    Employee findByFirstName(String username);
}
