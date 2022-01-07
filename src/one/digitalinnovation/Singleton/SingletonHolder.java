package one.digitalinnovation.Singleton;

public class SingletonHolder {
    private static class InstanceHolder {
        public static SingletonHolder instance = new SingletonHolder();
    }

    private SingletonHolder() {
        super();
    }

    public static SingletonHolder getInstance() {
        return InstanceHolder.instance;
    }
}
