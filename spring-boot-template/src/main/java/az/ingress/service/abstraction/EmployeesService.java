package az.ingress.service.abstraction;

import az.ingress.model.request.CreateOrUpdateEmployeesRequest;
import az.ingress.model.response.EmployeesResponse;

import java.util.List;

public interface EmployeesService {
     void createEmployee(CreateOrUpdateEmployeesRequest request);

     EmployeesResponse getEmployee(Long id);

     List<EmployeesResponse> getEmployees();

     void deleteEmployee(Long id);

    void uptadeEmployeesSalary(Long id, CreateOrUpdateEmployeesRequest request);



}
