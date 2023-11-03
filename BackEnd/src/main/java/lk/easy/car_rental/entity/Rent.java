package lk.easy.car_rental.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class Rent {
    @Id
    private String rentId;

    private Customer nic;
    private LocalDate pickUpDate;
    private LocalTime pickUpTime;
    private LocalDate returnDate;
    private LocalTime returnTime;
    private String driverRequest;
    private String status;
    private BigDecimal cost;
    private String description;

    @OneToMany(mappedBy = "rent",cascade = CascadeType.ALL)
    private List<RentDetail> rentDetails;
}