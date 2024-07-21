package az.ingress.model.request;

import az.ingress.model.enums.EmployeeStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateOrUpdateEmployeesRequest {
    private String name;
    private BigDecimal salary;



}
