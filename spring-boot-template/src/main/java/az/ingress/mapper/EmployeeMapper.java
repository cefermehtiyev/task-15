package az.ingress.mapper;

import az.ingress.dao.entity.EmployeesEntity;
import az.ingress.model.enums.EmployeeStatus;
import az.ingress.model.request.CreateOrUpdateEmployeesRequest;
import az.ingress.model.response.EmployeesResponse;

import javax.swing.text.html.parser.Entity;
import java.util.EnumMap;

import static az.ingress.model.enums.EmployeeStatus.DRAFT;

public enum EmployeeMapper {
    EMPLOYEE_MAPPER;


    public EmployeesEntity buildEmployee(CreateOrUpdateEmployeesRequest request){
        return EmployeesEntity.builder().
                name(request.getName()).
                salary(request.getSalary()).
                status(DRAFT).build();
    }

    public EmployeesResponse buildEmployeeResponse(EmployeesEntity employee){
        return EmployeesResponse.builder().
                id(employee.getId()).
                name(employee.getName()).
                salary(employee.getSalary()).
                status(employee.getStatus()).
                build();
    }
}
