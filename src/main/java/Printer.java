public class Printer {
    private int sheets;
    public int tonerVolume;

    public Printer(int sheets, int tonerVolume) {
        this.sheets = sheets;
        this.tonerVolume = tonerVolume;
    }

    public int print(int pages, int copies) {
        if (this.sheets - (pages * copies) < 0) {
            return this.sheets;
        }
        this.tonerVolume -= (pages * copies);
        return this.sheets - (pages * copies);
    };
}
