public class Printer {
    private int sheetsOfPaper;
    private int tonerVolume;

    public Printer(int sheetsOfPaper, int tonerVolume) {
        sheetsOfPaper = sheetsOfPaper;
        tonerVolume = tonerVolume;
    }

    public int getSheetsOfPaper() {
        return sheetsOfPaper;
    }

    public int getTonerVolume() {
        return tonerVolume;
    }
}
