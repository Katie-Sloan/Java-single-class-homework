public class Printer {
    private int sheets;

    public Printer(int sheets) {
        this.sheets = sheets;
    }

    public int print(int pages, int copies) {
        if (this.sheets - (pages * copies) < 0) {
            return this.sheets;
        }
        return this.sheets - (pages * copies);
    };
}
