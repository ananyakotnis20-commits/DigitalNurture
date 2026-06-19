import java.util.ArrayList;
import java.util.List;
public class StockMarket implements Stock{
    private List<Observer> observers=new ArrayList<>();
    private String stockname;
    private double price;

    public StockMarket(String stockname){
        this.stockname=stockname;

    }
    public void setprice(double price){
        System.out.println("\n[stockmarket"+stockname+"price changes to $"+price);
        this.price=price;
        notifyObservers();
    }
    @Override
    public void register(Observer o)    {observers.add(o);}
    @Override
    public void deregister(Observer o)  {observers.remove(o);}


    @Override
    public void notifyObservers(){
        for(Observer o: observers){
            o.update(stockname,price);
        }
    }
}
