public class RealImage implements Image{
    private String filename;
    public RealImage(String filename){
        this.filename=filename;
        loadFromServer();

    }
    private void loadFromServer(){
        System.out.println("LOADING IMAGE FROM SERVER: "+filename);
    }
    @Override
    public void display()
    {
        System.out.println("Displaying:: "+filename);
    }
}
