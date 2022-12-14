package command;

public class Demo {

    public static void main(String[] args) {
        Stock stock = new Stock("Tesla", 200);

        BuyStock buyStock = new BuyStock(stock);
        SellStock sellStock = new SellStock(stock);

        Broker broker = new Broker();

        broker.takeOrder(buyStock);
        broker.takeOrder(sellStock);

        broker.placeOrders();
    }

}
