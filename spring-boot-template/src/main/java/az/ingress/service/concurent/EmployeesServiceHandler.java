package az.ingress.service.concurent;

import az.ingress.dao.entity.EmployeesEntity;
import az.ingress.dao.repository.EmployeesRepository;
import az.ingress.model.request.CreateOrUpdateEmployeesRequest;
import az.ingress.model.response.EmployeesResponse;
import az.ingress.service.abstraction.EmployeesService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

import static az.ingress.mapper.EmployeeMapper.EMPLOYEE_MAPPER;
import static az.ingress.model.enums.EmployeeStatus.DELETED;


@Service
@RequiredArgsConstructor
public class EmployeesServiceHandler implements EmployeesService {

    private final EmployeesRepository repository;

    @Override
    public void createEmployee(CreateOrUpdateEmployeesRequest request) {
        repository.save(EMPLOYEE_MAPPER.buildEmployee(request));


    }


    @Override
    public EmployeesResponse getEmployee(Long id) {

        return EMPLOYEE_MAPPER.buildEmployeeResponse(fetchEmployeeIfExist(id));

    }


    @Override
    public List<EmployeesResponse> getEmployees() {

         return repository.findAll().
                 stream().
                 map(EMPLOYEE_MAPPER::buildEmployeeResponse).
                 toList();
    }

    @Override
    public void deleteEmployee(Long id) {
        var employee = fetchEmployeeIfExist(id);
        employee.setStatus(DELETED);
        repository.save(employee);


    }

    @Override
    public void uptadeEmployeesSalary(Long id, CreateOrUpdateEmployeesRequest request) {
        var employee = fetchEmployeeIfExist(id);
        employee.setSalary(request.getSalary());
        repository.save(employee);

    }

    @PostConstruct
    public void test(){
        var employee= repository.getWithStatus(DELETED);
        employee.forEach(it-> {
            System.out.println("Employee id"+it.getId());
        });

    }

    private EmployeesEntity fetchEmployeeIfExist(Long id) {
        return repository.findById(id).
                orElseThrow(RuntimeException::new);
    }
}
