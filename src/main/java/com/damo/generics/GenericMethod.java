package main.java.com.damo.generics;

public class GenericMethod {
    private static <T> boolean isEqual(GenericssClass<T> g1, GenericssClass<T> g2){
        return g1.getItem().equals(g2.getItem());
    }

    private static <T extends Comparable<T>> int compare(T t1,T t2){
        return t1.compareTo(t2);
    }

    public static void main(String[] args){
        GenericssClass<String> g1 = new GenericssClass<>();
        g1.setItem("xi'an");

        GenericssClass<String> g2 = new GenericssClass<>();
        g2.setItem("xi'an");

        boolean isEqual = GenericMethod.isEqual(g1,g2);
        System.out.println(isEqual);

        int compareResult = GenericMethod.compare(19,12);
        System.out.println(compareResult);
    }
}
