public class CommandTest {
    public static void main(String[] args){
        Light light=new Light();
        RemoteControl remote=new RemoteControl();

        remote.setCommand(new LightOnCommand(light));
        remote.pressbutton();

        remote.setCommand(new LightOffCommand(light));
        remote.pressbutton();
    }
}
