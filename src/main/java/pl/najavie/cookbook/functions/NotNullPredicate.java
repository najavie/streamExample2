package pl.najavie.cookbook.functions;

import java.util.function.Predicate;

/**
 * Created by krzysztof on 1/3/15.
 */
public class NotNullPredicate implements Predicate<Object> {

    public static final NotNullPredicate INSTANCE = new NotNullPredicate();
    private NotNullPredicate() {

    }

    @Override
    public boolean test(Object o) {
        return o != null;
    }
}
