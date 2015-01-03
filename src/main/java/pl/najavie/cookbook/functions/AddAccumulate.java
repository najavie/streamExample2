package pl.najavie.cookbook.functions;

import java.util.function.BinaryOperator;

/**
 * Created by krzysztof on 1/3/15.
 */
public class AddAccumulate implements BinaryOperator<Integer> {

    public static final AddAccumulate INSTANCE = new AddAccumulate();

    private AddAccumulate() {

    }
    @Override
    public Integer apply(Integer integer, Integer integer2) {
        return integer2+integer;
    }
}
