import java.util.*;

class Stock {
    String name;
    double buyPrice;
    double currentPrice;
    String reasonForLoss;
    
    public Stock(String name, double buyPrice, double currentPrice, String reasonForLoss) {
        this.name = name;
        this.buyPrice = buyPrice;
        this.currentPrice = currentPrice;
        this.reasonForLoss = reasonForLoss;
    }
}

class StockMarketBot {
    private Map<String, Stock> stockPortfolio;
    
    public StockMarketBot() {
        stockPortfolio = new HashMap<>();
    }
    
    public void buyStock(String name, double price) {
        stockPortfolio.put(name, new Stock(name, price, price, "No loss detected yet."));
        System.out.println("Stock " + name + " purchased at $" + price);
    }
    
    public void updateStockPrice(String name, double newPrice, String reason) {
        if (stockPortfolio.containsKey(name)) {
            Stock stock = stockPortfolio.get(name);
            stock.currentPrice = newPrice;
            if (newPrice < stock.buyPrice) {
                stock.reasonForLoss = reason;
                System.out.println("Alert: " + name + " is losing value! Reason: " + reason);
            }
        } else {
            System.out.println("Stock not found in portfolio.");
        }
    }
    
    public void checkLossReason(String name) {
        if (stockPortfolio.containsKey(name)) {
            Stock stock = stockPortfolio.get(name);
            if (stock.currentPrice < stock.buyPrice) {
                System.out.println("Loss detected for " + name + ". Reason: " + stock.reasonForLoss);
            } else {
                System.out.println(name + " is not in loss.");
            }
        } else {
            System.out.println("Stock not found in portfolio.");
        }
    }
}

public class StockMarketChatBot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StockMarketBot bot = new StockMarketBot();
        
        while (true) {
            System.out.println("Enter command (buy, update, check, exit): ");
            String command = scanner.next();
            
            if (command.equalsIgnoreCase("buy")) {
                System.out.print("Enter stock name: ");
                String name = scanner.next();
                System.out.print("Enter buy price: ");
                double price = scanner.nextDouble();
                bot.buyStock(name, price);
            } else if (command.equalsIgnoreCase("update")) {
                System.out.print("Enter stock name: ");
                String name = scanner.next();
                System.out.print("Enter new price: ");
                double newPrice = scanner.nextDouble();
                System.out.print("Enter reason for loss (if any): ");
                scanner.nextLine(); // Consume newline
                String reason = scanner.nextLine();
                bot.updateStockPrice(name, newPrice, reason);
            } else if (command.equalsIgnoreCase("check")) {
                System.out.print("Enter stock name to check loss reason: ");
                String name = scanner.next();
                bot.checkLossReason(name);
            } else if (command.equalsIgnoreCase("exit")) {
                System.out.println("Exiting chatbot.");
                break;
            } else {
                System.out.println("Invalid command. Try again.");
            }
        }
        scanner.close();
    }
}
