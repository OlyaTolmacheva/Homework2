public class Main {
    public static void main(String[] args) {
        Market market = new Market();
        Human ivan = new Human("Ivan");
        Human maria = new Human("Maria");
        market.acceptToMarket(ivan);
        market.acceptToMarket(maria);
        market.update();
    }
}