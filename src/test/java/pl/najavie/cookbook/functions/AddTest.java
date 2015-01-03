package pl.najavie.cookbook.functions;

import com.google.common.collect.Lists;
import junit.framework.TestCase;

import java.util.List;

public class AddTest extends TestCase {

    public void testApply() throws Exception {
        List<Integer> integers = Lists.newArrayList(1,2,3,4,5);
        assertEquals(Add.INSTANCE.apply(integers).intValue(),15);
    }
}