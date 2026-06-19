public class ProxyTest {
    public static void main(String[] args){
        Image image=new ProxyImage("photograph.jpg");
        System.out.println("First call:");
        image.display(); // loads from server

        System.out.println("\nSecond call:");
        image.display(); // uses cache!

        System.out.println("\nThird call:");
        image.display();

    }
}
