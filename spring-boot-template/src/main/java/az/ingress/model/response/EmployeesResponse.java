package az.ingress.model.response;

import az.ingress.model.enums.SalaryStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeesResponse {
    private Long id;
    private String name;
    private Integer salary;
    private SalaryStatus status;
}
