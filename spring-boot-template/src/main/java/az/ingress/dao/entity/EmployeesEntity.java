package az.ingress.dao.entity;


import az.ingress.model.enums.SalaryStatus;
import lombok.*;

import javax.persistence.*;
@Getter
@Setter
@EqualsAndHashCode(of = "id")
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "employees")
public class EmployeesEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Integer salary;

    @Enumerated(EnumType.STRING)
    private SalaryStatus status;
}
