package az.ingress.controller;
import az.ingress.model.request.CreateOrUpdateEmployeesRequest;
import az.ingress.model.response.EmployeesResponse;
import az.ingress.service.abstraction.EmployeesService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.NO_CONTENT;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/employees")
public class EmployeesController {
    private final EmployeesService employeesService;

    @PostMapping
    @ResponseStatus(CREATED)
    public void createEmployees(@RequestBody CreateOrUpdateEmployeesRequest request){
        employeesService.createEmployee(request);
    }

    @GetMapping("{id}")
    public EmployeesResponse getEmployees(@PathVariable Long id){
        return employeesService.getEmployee(id);
    }

    @GetMapping
    public List<EmployeesResponse> getusers(){
        return employeesService.getEmployees();
    }


    @DeleteMapping("{id}")
    @ResponseStatus(NO_CONTENT)
    public  void deleteEmployees(@PathVariable Long id){
        employeesService.deleteEmployee(id);
    }

    @PatchMapping("{id}")
    @ResponseStatus(NO_CONTENT)
    public void updateEmployees(@PathVariable Long id,@RequestBody CreateOrUpdateEmployeesRequest request){
        employeesService.uptadeEmployeesSalary(id,request);
    }

}
