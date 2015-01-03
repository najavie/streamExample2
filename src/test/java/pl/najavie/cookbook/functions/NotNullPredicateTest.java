package pl.najavie.cookbook.functions;

import junit.framework.TestCase;

public class NotNullPredicateTest extends TestCase {

    public void testNotNull() throws Exception {
        Integer one = 1;
        assertTrue(NotNullPredicate.INSTANCE.test(one));
    }

    public void testNull() throws Exception {
        Integer nullInt = null;
        assertFalse(NotNullPredicate.INSTANCE.test(nullInt));
    }
}