package main.java.com.damo.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ListforEach {
    class MyConsumer implements Consumer<Object> {

        @Override
        public void accept(Object o) {
            System.out.println("Processing...");
        }
    }

    public static void main(String[] args) {
        List<String> stocks = new ArrayList<>();
        stocks.add("Alibaba");
        stocks.add("Mi");
        stocks.add("Tencent");
        stocks.add("Maotai");

        Consumer<Object> consumer = new ListforEach().new MyConsumer();

        stocks.forEach(consumer);
        stocks.forEach(x -> System.out.println("processed " + x));
    }
}