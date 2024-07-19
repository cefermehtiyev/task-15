package az.ingress.dao.repository;


import az.ingress.dao.entity.EmployeesEntity;
import az.ingress.model.enums.EmployeeStatus;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmployeesRepository extends CrudRepository<EmployeesEntity,Long> {

    @Override
    List<EmployeesEntity> findAll();

    @Query( value = " SELECT  e FROM EmployeesEntity e WHERE e.status =:status")
    List<EmployeesEntity> getWithStatus(EmployeeStatus status);

}
