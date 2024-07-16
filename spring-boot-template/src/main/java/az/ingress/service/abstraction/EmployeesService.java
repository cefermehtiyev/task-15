package az.ingress.service.abstraction;

import az.ingress.model.request.CreateOrUpdateEmployeesRequest;
import az.ingress.model.response.EmployeesResponse;

import java.util.List;

public interface EmployeesService {
     void createEmployees(CreateOrUpdateEmployeesRequest request);

     EmployeesResponse getEmployees(Long id);

     List<EmployeesResponse> getEmployees();

     void deleteEmployees(Long id);

    void uptadeEmployeesSalary(Long id, CreateOrUpdateEmployeesRequest request);



}
