public class Mobileapp implements Observer{
    private String appname;
    public Mobileapp(String appname){
        this.appname=appname;
    }
    @Override
    public void update(String stockname,double price){
        System.out.println("Mobile app"+appname+"alert:"+stockname+"is now $"+price);
    }
}
