package VhsRentCar.Services;

import VhsRentCar.entities.CarRental;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@lombok.Data
public class RentaService {
    private Double pricePerDay;
    private Double pricePerHour;
    private BrazilTax brazilTax;
    public void ProcesseInvoice(CarRental carRental){
        System.out.println("aas");
    }

}
