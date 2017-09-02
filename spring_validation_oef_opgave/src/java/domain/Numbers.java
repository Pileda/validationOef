package domain;

import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.NumberFormat;
import validator.ValidEven;

public class Numbers {

    /* amount
    	maximum is 5000.50 (grens inbegrepen)
	wordt steeds met twee cijfers na de komma afgebeeld
	initiële waarde = 2000.856
     */
    @DecimalMax("5000.50")
    @NumberFormat(pattern = "#,##0.00")
    private double amount = 2000.856;

    /* number1
                moet ingevuld zijn
                moet liggen tussen 1 en 11000 (grenzen inbegrepen)
    	initiële waarde = 2000 (wordt afgebeeld als 2.000)
     */
    @Range(min = 1, max = 11000)
    @NumberFormat(style = NumberFormat.Style.NUMBER)
    @NotNull
    private Integer number1 = 2000;

    /*
    number2
        moet ingevuld zijn
        initiële waarde = 1234566
     */
    @NotNull
    @NumberFormat(style = NumberFormat.Style.NUMBER)
    @ValidEven
    private Integer number2 = 1234566;

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Integer getNumber1() {
        return number1;
    }

    public void setNumber1(Integer number1) {
        this.number1 = number1;
    }

    public Integer getNumber2() {
        return number2;
    }

    public void setNumber2(Integer number2) {
        this.number2 = number2;
    }
}
