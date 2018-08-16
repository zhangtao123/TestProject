package adapter;

/**
 * Created with IntelliJ IDEA.
 * User: User
 * Date: 2018/8/16
 * Time: 17:31
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class DuckTestDrive {
    public static void main(String[] args) {
        //鸭子对象
        MallardDuck duck = new MallardDuck();
        //火鸡对象
        WildTurkey turkey = new WildTurkey();
        //火鸡适配器,将火鸡适配成鸭子对象
        Duck turkeyAdapter = new TurkeyAdapter(turkey);
        System.out.println("The Turkey says...");
        turkey.gobble();
        turkey.fly();

        System.out.println("\nThe Duck says...");
        testDuck(duck);



        System.out.println("\nThe TurkeyAdapter says...");
        testDuck(turkeyAdapter);
    }


    static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}