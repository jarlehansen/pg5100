package no.westerdals;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class SubscriptionValidator implements ConstraintValidator<SubscriptionType, Subscription> {

    @Override
    public void initialize(SubscriptionType subscriptionType) {
    }

    @Override
    public boolean isValid(Subscription subscription, ConstraintValidatorContext constraintValidatorContext) {
        if ((subscription.getType() == null || subscription.getType().isEmpty()) && subscription.getCost() == 0) {
            return true;
        } else if (subscription.getType() != null && !subscription.getType().isEmpty() && subscription.getCost() > 0) {
            return true;
        }
        return false;
    }
}
