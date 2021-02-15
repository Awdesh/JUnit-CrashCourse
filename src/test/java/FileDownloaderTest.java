import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.*;

// Below annotation is required when we are going to use Mockito.
@RunWith(MockitoJUnitRunner.class)
public class FileDownloaderTest {

    @Test
    public void testPrint() {
        FileHelper fileHelper = mock(FileHelper.class);
        FileDownloader fileDownloader = new FileDownloader(fileHelper);
        fileDownloader.print();
    }

    @Test
    public void testHasPrinted() {
        FileHelper fileHelper = mock(FileHelper.class);
        FileDownloader fileDownloader = new FileDownloader(fileHelper);

        boolean val = fileDownloader.hasPrinted();
        Assert.assertFalse(val);
    }

    @Test
    public void testGetSum() {
        FileHelper fileHelper = mock(FileHelper.class);
        FileDownloader fileDownloader = new FileDownloader(fileHelper);
        int sum = fileDownloader.getSum(5,10);
        Assert.assertEquals(sum, 15);
    }

    @Test
    public void testGetSum_MockExample() {
        FileHelper fileHelper = mock(FileHelper.class);
        //stubbing
        doReturn(10).when(fileHelper).calculate(anyInt(), anyInt());

        FileDownloader fileDownloader = new FileDownloader(fileHelper);
        int s = fileDownloader.getSum(1,2);
        Assert.assertEquals(s, 10);

        // Verify that mock method has been called.
        verify(fileHelper, times(1)).calculate(anyInt(), anyInt());
    }
}
