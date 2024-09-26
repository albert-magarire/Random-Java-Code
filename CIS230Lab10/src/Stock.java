public class Stock {
    private String symbol;
    private String name;
    private double previousClosingPrice;
    private double currentPrice;

    public Stock(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }

    public double getChangePercent() {
        return ((currentPrice - previousClosingPrice) / previousClosingPrice) * 100;
    }

    public static void main(String[] args) {
        Stock oracleStock = new Stock("ORCL", "Oracle Corporation");
        oracleStock.previousClosingPrice = 34.5;
        oracleStock.currentPrice = 34.35;

        System.out.println("Price change percentage: " + oracleStock.getChangePercent() + "%");
    }
}
