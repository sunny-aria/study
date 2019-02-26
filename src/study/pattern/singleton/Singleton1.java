package study.pattern.singleton;

/**
 * 非线程懒汉模式
 */
public class Singleton1 {
    private static  Singleton1 instance=null;
    private Singleton1(){}
    public static Singleton1 getInstance(){
        if(instance==null){
            instance = new Singleton1();
        }
        return instance;
    }
}
