/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 *
 * @author pjcli_000
 */
class EvenConstraintValidator implements ConstraintValidator<ValidEven, Integer> {

    @Override
    public void initialize(ValidEven constraintAnnotation) {
    }

    @Override
    public boolean isValid(Integer value, ConstraintValidatorContext context) {
        return (value % 2 == 0);
    }

}
