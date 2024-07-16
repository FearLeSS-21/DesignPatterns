public class Singleton {
    private static Singleton InstanceValue;
    private Singleton() {

    }

    public static Singleton getInstanceofvalue() {
        if (InstanceValue == null) {
            InstanceValue= new Singleton();
        }
        return InstanceValue;

    }
    public void PrintData(){

        System.out.println("Ameirka yahhh");
    }

}
