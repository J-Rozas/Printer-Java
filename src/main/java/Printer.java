public class Printer {
    private int sheetsOfPaper;
    private int tonerVolume;

    public Printer(int numberOfSheets, int volumeOfToner) {
        sheetsOfPaper = numberOfSheets;
        tonerVolume = volumeOfToner;
    }

    public int getSheetsOfPaper() {
        return sheetsOfPaper;
    }

    public int getTonerVolume() {
        return tonerVolume;
    }

    public String print(int copies, int pages) {
        int totalCopies = copies * pages;

        if (totalCopies > sheetsOfPaper) {
            sheetsOfPaper -= totalCopies;
            tonerVolume -= totalCopies;
            return "Printed " + totalCopies + " sheets of paper";
        } else {
            return "Not enough paper to print that";
        }
    }
}
