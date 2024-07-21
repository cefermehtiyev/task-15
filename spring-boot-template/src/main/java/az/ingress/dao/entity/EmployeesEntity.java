package az.ingress.dao.entity;

import az.ingress.model.enums.EmployeeStatus;
import lombok.*;
import javax.persistence.*;
import java.math.BigDecimal;

@Getter
@Setter
@EqualsAndHashCode(of = "id")
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Table(name = "employees")
public class EmployeesEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private BigDecimal salary;

    @Enumerated(EnumType.STRING)
    private EmployeeStatus status;
}
