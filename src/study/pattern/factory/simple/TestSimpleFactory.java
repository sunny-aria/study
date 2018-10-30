package study.pattern.factory.simple;

/**
 * 功能描述：测试简单工厂
 *
 * @Auther:
 * @Date: 2018/10/30
 */
public class TestSimpleFactory {
    public static void main(String[] args) {
        PizzaStore store = new PizzaStore();
        SimpleFactory factory = new SimpleFactory();
        store.setFactory(factory);
        store.pizzaOrderCreate("meat");
        System.out.println("-------------------------");
        store.pizzaOrderCreate("apple");
    }
}
