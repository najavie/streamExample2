package pl.najavie.cookbook.functions;

import java.util.function.Predicate;

/**
 * Created by krzysztof on 1/3/15.
 */
public class HashCodeEvenPredicate implements Predicate {

    public static final HashCodeEvenPredicate INSTANCE = new HashCodeEvenPredicate();

    private HashCodeEvenPredicate() {

    }

    @Override
    public boolean test(Object o) {
        return o.hashCode() %2 == 0;
    }
}
