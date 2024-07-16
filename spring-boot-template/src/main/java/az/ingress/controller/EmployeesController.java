package az.ingress.controller;

import az.ingress.model.request.CreateOrUpdateEmployeesRequest;
import az.ingress.model.response.EmployeesResponse;
import az.ingress.service.abstraction.EmployeesService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequiredArgsConstructor
@RequestMapping("v1/employees")
public class EmployeesController {
    private final EmployeesService employeesService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createEmployees(@RequestBody CreateOrUpdateEmployeesRequest request){
        employeesService.createEmployees(request);
    }

    @GetMapping("{id}")
    public EmployeesResponse getEmployees(@PathVariable Long id){
        return employeesService.getEmployees(id);
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public  void deleteEmployees(@PathVariable Long id){
        employeesService.deleteEmployees(id);
    }

    @PatchMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateEmployees(@PathVariable Long id,@RequestBody CreateOrUpdateEmployeesRequest request){
        employeesService.uptadeEmployeesSalary(id,request);
    }

}
