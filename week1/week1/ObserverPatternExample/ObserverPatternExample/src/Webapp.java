// WebApp.java
public class Webapp implements Observer {
    private String siteName;

    public Webapp(String siteName) { this.siteName = siteName; }

    @Override
    public void update(String stockName, double price) {
        System.out.println("[WebApp - " + siteName + "] Update: "
                + stockName + " = $" + price);
    }
}