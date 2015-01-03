package pl.najavie.cookbook.functions;

import java.util.List;
import java.util.function.Function;

/**
 * Created by krzysztof on 1/3/15.
 */
public class Add implements Function<List<Integer>,Integer> {

    public static final Add INSTANCE = new Add();
    private Add() {

    }

    @Override
    public Integer apply(List<Integer> integers) {
        return integers.parallelStream().reduce((number,accumulator) -> accumulator+=number).get();
    }
}
