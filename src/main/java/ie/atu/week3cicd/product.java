package ie.atu.week3cicd;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class product {
    @NotBlank
    @Size(min = 1, max = 100)
    private String Productname;
    @Positive
    @DecimalMin(value = "2")
    private double Productprice;
}
