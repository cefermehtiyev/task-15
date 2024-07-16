package az.ingress.dao.repository;


import az.ingress.dao.entity.EmployeesEntity;
import org.springframework.data.repository.CrudRepository;

public interface EmployeesRepository extends CrudRepository<EmployeesEntity,Long> {
}
