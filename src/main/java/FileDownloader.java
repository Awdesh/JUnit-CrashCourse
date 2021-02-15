public class FileDownloader {

    private FileHelper fileHelper;

    public FileDownloader(FileHelper fileHelper) {
        this.fileHelper = fileHelper;
    }

    public void print() {
        System.out.println("printing");
    }

    public boolean hasPrinted() {
        return false;
    }

    public int getSum(int a, int b) {
        // Injecting fileHelper as a dependency,
        // helpful in testing.
        return fileHelper.calculate(a,b);
    }
}
