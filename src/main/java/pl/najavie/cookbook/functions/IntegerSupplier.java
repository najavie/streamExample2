package pl.najavie.cookbook.functions;

import org.apache.commons.lang.math.RandomUtils;

import java.util.function.IntSupplier;

/**
 * Created by krzysztof on 1/3/15.
 */
public class IntegerSupplier implements IntSupplier {

    public static final IntegerSupplier INSTANCE = new IntegerSupplier();

    private IntegerSupplier() {

    }

    @Override
    public int getAsInt() {
        return RandomUtils.nextInt();
    }
}
