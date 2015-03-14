package org.alltiny.common.index;

import junit.framework.Assert;
import org.junit.Test;

/**
 * This test ensures that {@link Index} work properly.
 */
public class IndexTest {

    @Test
    public void testInternalListIsRemoved() {
        Index<Integer,String> index = new Index<>();
        index.put(1, "1");
        Assert.assertEquals("size of index should be correct", 1, index.size());
        index.put(1, "2");
        Assert.assertEquals("size of index should be correct", 1, index.size());
        index.remove(1, "1");
        Assert.assertEquals("size of index should be correct", 1, index.size());
        index.remove(1, "2");
        Assert.assertEquals("size of index should be correct", 0, index.size());
        Assert.assertTrue("index should be empty now", index.isEmpty());
    }
}
