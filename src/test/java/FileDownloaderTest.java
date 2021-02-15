import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

public class FileDownloaderTest {

    @Test
    public void testPrint() {
        FileDownloader fileDownloader = new FileDownloader();
        fileDownloader.print();
    }

    @Test
    public void testHasPrinted() {
        FileDownloader fileDownloader = new FileDownloader();
        boolean val = fileDownloader.hasPrinted();
        Assert.assertFalse(val);
    }
}
