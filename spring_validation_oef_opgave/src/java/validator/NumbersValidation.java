/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validator;

import domain.Numbers;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

/**
 *
 * @author pjcli_000
 */
public class NumbersValidation implements Validator {

    @Override
    public boolean supports(Class<?> type) {
        return Numbers.class.isAssignableFrom(type);
    }

    @Override
    public void validate(Object o, Errors errors) {
        Numbers number = (Numbers) o;
        int number1 = number.getNumber1();
        int number2 = number.getNumber2();
        if (number1 > number2) {
            errors.rejectValue("number1", "matchingNumbers.Numbers.number1", "Number1 must be lower than Number2");
        }
    }

}
