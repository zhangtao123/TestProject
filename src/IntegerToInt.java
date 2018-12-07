package src;

/**
 * Created with IntelliJ IDEA.
 * User: User
 * Date: 2018/8/8
 * Time: 16:52
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class IntegerToInt {
    public static void main(String[] args) {
        Integer a = 1;
        Integer b = 2;
        Integer c = 3;
        Integer d = 3;
        Integer e = 321;
        Integer f = 321;
        Long g = 3L;

        System.out.println(c==d);
        //==在没有遇到算术运算的情况下不会自动拆箱
        System.out.println(e==f);
        //不同的对象但是内容相同
        System.out.println(e.equals(f));
        System.out.println(c==(a+b));
        System.out.println(c.equals(a+b));
        System.out.println(g==(a+b));
        //equals不会处理数据转型的关系
        System.out.println(g.equals(a+b));
    }
}