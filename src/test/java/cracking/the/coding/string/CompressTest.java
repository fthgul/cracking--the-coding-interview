package cracking.the.coding.string;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by lenova on 08/12/2019.
 */
public class CompressTest {
    private Compress compress;

    @Before
    public void initiateCompress() {
        compress = new Compress();
    }

    @Test
    public void testCompress() {
        assertEquals(compress.doCompress("aabcccccaaa"),String.valueOf("a2b1c5a3"));
        assertEquals(compress.doCompress("abcd"),String.valueOf("abcd"));
    }


}
