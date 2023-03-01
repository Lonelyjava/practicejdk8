package practicejdk8.com.stream;

import java.util.function.Consumer;

class MyConsumer implements Consumer<Integer> {

    public void accept(Integer t) {
        System.out.println("Consumer impl Value::"+t);
    }
}
