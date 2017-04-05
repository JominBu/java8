package com.jd;

import java.util.Arrays;
import java.util.function.Supplier;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Arrays.asList("a","b","c").stream().filter(s -> s.equals("a")).forEach(e -> System.out.println(e));



        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("run...");
            }
        });

        Thread thread2 = new Thread(()->
            System.out.println("lambda run ...")
        );

        thread1.start();
        thread2.start();


//        Defaultable defaultable = DefaultableFactory.create(DefaultableImpl::new);
//        System.out.println(defaultable.notRequired());
//
//        defaultable = DefaultableFactory.create(OverridableImpl::new);
//        System.out.println(defaultable.notRequired());
    }

    private static class DefaultableImpl implements Defaultable {

    }

    private static class OverridableImpl implements Defaultable {
        @Override
        public String notRequired() {
            return "Override implementation";
        }
    }

    private interface DefaultableFactory {
        static Defaultable create(Supplier<Defaultable> supplier) {
            return supplier.get();
        }
    }

}

