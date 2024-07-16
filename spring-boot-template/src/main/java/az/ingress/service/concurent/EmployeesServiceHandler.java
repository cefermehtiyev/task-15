package az.ingress.service.concurent;

import az.ingress.dao.repository.EmployeesRepository;
import az.ingress.model.request.CreateOrUpdateEmployeesRequest;
import az.ingress.model.response.EmployeesResponse;
import az.ingress.service.abstraction.EmployeesService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class EmployeesServiceHandler implements EmployeesService {

    private final EmployeesRepository repository;

    @Override
    public void createEmployees(CreateOrUpdateEmployeesRequest request) {

    }

    @Override
    public EmployeesResponse getEmployees(Long id) {
        return null;
    }

    @Override
    public List<EmployeesResponse> getEmployees() {
        return List.of();
    }

    @Override
    public void deleteEmployees(Long id) {

    }

    @Override
    public void uptadeEmployeesSalary(Long id, CreateOrUpdateEmployeesRequest request) {

    }
}
