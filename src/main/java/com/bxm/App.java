package com.bxm;

import java.util.function.Supplier;

/**
 * Hello world!
 *
 */
public class App 
{
    private String a;
    public static void main( String[] args )
    {

//        Arrays.asList("a","b","c").stream().filter(s -> s.equals("a")).map(a->a+"b").forEach(e -> System.out.println(e));
//
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


//        Optional<String> fullName = Optional.ofNullable(null);
//        System.out.println("Full name is set?" + fullName.isPresent());
//        System.out.println("Full name: " + fullName.orElseGet(()->"[none]"));
//        System.out.println(fullName.map(s -> "Hey " + s + "!").orElse("Hey Stranger!"));
//        System.out.println("Full name is set?" + fullName.isPresent());

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

