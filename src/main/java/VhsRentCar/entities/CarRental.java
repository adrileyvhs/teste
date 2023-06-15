package VhsRentCar.entities;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import java.util.Date;
@AllArgsConstructor
@NoArgsConstructor
@lombok.Data
public class CarRental {
    private Date start;
    private Date finish;
    private Vehicle vehicle;
    private Invoice invoice;
    public CarRental(Date start, Date finish, Vehicle vehicle) {
        this.start   = start;
        this.finish  = finish;
        this.vehicle = vehicle;
    }
}
