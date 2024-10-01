package app;
public class MainProgram {
    public static void main(String[] args) {
        String product = "smartphone,";
        String product2 = "laptop";
        int smartphones = 10;
        int laptops = 10;
        int days = 5;
        int days2 = 7;
        double priceSmartphone = 243.0682;
        double priceLaptop = 149.8122;

        double sumForOneDayS = smartphones * priceSmartphone;
        double sumForFiveDays = sumForOneDayS * days;

        double sumForOneDayL = laptops * priceLaptop;
        double sumForSevenDays = sumForOneDayL * days2;

        System.out.printf("Product No 1: %s\n total sales for %d days is EUR %.2f,\n" +
                "sales by day is EUR %.2f.",product,days,sumForFiveDays,sumForOneDayS);

        System.out.printf("\nProduct No 2: %s\n total sales for %d days is EUR %.2f,\n" +
                "sales by day is EUR %.2f.",product2,days2,sumForSevenDays,sumForOneDayL);
    }
}
