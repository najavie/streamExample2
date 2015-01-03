package pl.najavie.cookbook.functions;

import junit.framework.TestCase;

public class AddAccumulateTest extends TestCase {

    public void testApply() throws Exception {
        Integer one = 1;
        Integer two = 2;

        Integer result = AddAccumulate.INSTANCE.apply(one,two);
        assertEquals(result.intValue(),one+two);

    }
}