public class ObserverTest {
    public static void main(String[] args)
    {
        StockMarket apple=new StockMarket("apple");
        Observer mobile=new Mobileapp("stockapp");
        Observer web=new Webapp("finance.com");

        apple.register(mobile);
        apple.register(web);

        apple.setprice(175.50);
        apple.setprice(180.00);

        System.out.println("\n[Deregistering WebApp]");
        apple.deregister(web);

        apple.setprice(165.00);
    }

}
