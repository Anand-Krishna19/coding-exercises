package lambda_exp_coding;

import java.lang.*;

/*
 * Create and start a new thread using a lambda expression instead of an anonymous Runnable class.
 */
public class RunnableLambda {

    static void main(String[] args) throws InterruptedException {
        System.out.println("Main Thread started....." + Thread.currentThread());
        Thread th = new Thread(() -> {
            System.out.println("thread name-> " + Thread.currentThread());
        });
        th.start();
        th.join();
        System.out.println("Thread ended....." + Thread.currentThread());
    }
}
