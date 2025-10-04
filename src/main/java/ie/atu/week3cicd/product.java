package ie.atu.week3cicd;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class product {
    @NotBlank
    private String Productname;
    @Positive
    private double Productprice;
}
