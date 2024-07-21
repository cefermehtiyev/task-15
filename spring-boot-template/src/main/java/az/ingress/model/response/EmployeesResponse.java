package az.ingress.model.response;

import az.ingress.model.enums.EmployeeStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EmployeesResponse {
    private Long id;
    private String name;
    private BigDecimal salary;
    private EmployeeStatus status;
}
