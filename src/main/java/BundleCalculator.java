import service.OrderService;
import service.PriceListService;
import service.ReportService;

/**
 * Main interface for the Bundle Calculator
 */
public class BundleCalculator {
    private OrderService os = new OrderService();
    private PriceListService ps = new PriceListService();
    private ReportService rs = new ReportService();

    /**
     * Main method to run the bundle calculator
     * @param args the first argument is the price list file path; the second argument is the order file path
     */
    public static void main(String[] args) {
        BundleCalculator bc = new BundleCalculator();
        String priceListFilePath = "src/main/resources/priceList.txt";
        String orderFilePath = "src/main/resources/orders.txt";
        if (args.length == 2) {
            priceListFilePath = args[0];
            orderFilePath = args[1];
        }
        bc.ps.updatePriceListFromFile(priceListFilePath);
        bc.os.loadOrderFile(orderFilePath);
        bc.rs.calculateAndPrintCost(bc.os, bc.ps);
    }
}
