package one.digitalinnovation.Singleton;

public class Teste {
    public static void main(String[] args) {
        SingletonLazy lazy = SingletonLazy.getInstance();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstance();
        System.out.println(lazy);

        SingletonEager Eager = SingletonEager.getInstance();
        System.out.println(Eager);
        Eager = SingletonEager.getInstance();
        System.out.println(Eager);

        SingletonHolder Holder = SingletonHolder.getInstance();
        System.out.println(Holder);
        Holder = SingletonHolder.getInstance();
        System.out.println(Holder);
    }
}
