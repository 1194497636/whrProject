package main.java.com.damo.generics;

class GenericsClass<P> {
    P ob;

    public GenericsClass(P ob) {
        this.ob = ob;
    }

    public P getOb() {
        return ob;
    }

    void getType(){
        System.out.println("Type is "+ob.getClass().getName());
    }
}

public class ScratchGenerics {
    public static void main(String[] args) {
        GenericsClass<Double> dob = new GenericsClass<>(3.14);
        dob.getType();
        System.out.println("Value is "+dob.getOb());

        GenericsClass<String> strob = new GenericsClass<>("Generics demo ");
        strob.getType();
        System.out.println("Value is "+strob.getOb());
    }
}
