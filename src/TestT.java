package src;

/**
 * Created with IntelliJ IDEA.
 * User: User
 * Date: 2018/8/2
 * Time: 16:44
 * To change this template use File | Settings | File Templates.
 * Description:
 */

public class TestT {

    public static void main(String[] args) {
        Box<String> name = new Box<>("corn");
        Box<Integer> age = new Box<>(712);
        Box<Number> number = new Box<>(314);


        getUpperStringData(name);


        System.out.println(getUpperTData(name));


        //getUpperNumberData(name);
        getUpperNumberData(age);
        getUpperNumberData(number);


        getData(name);
        getData(age);
        getData(number);

        Box<Number> b = new Box<>(718);
        System.out.println(b.getData().getClass());
        Integer in = 123;
        b.setData(in);
        System.out.println(b.getData().getClass());
    }


    //该方法只接受Number类型的之类的对象
    public static void getUpperStringData(Box<String> data) {
        System.out.println("data :" + data.getData());
    }

    //该方法只接受Number类型的之类的对象
    public static void getUpperNumberData(Box<? extends Number> data) {
        System.out.println("data :" + data.getData());
    }


    //该方法只接受Number类型的之类的对象
    public static <T> T getUpperTData(Box<T> data) {
        T t = data.getData();
        return t;
    }


    //该方法可以接受不同的泛型对象
    public static void getData(Box<?> data) {
        System.out.println("data :" + data.getData());
    }


    /* public static <T,K> T getAllData(Box<K> box){
        System.out.println(box.getData());
        T str = box.getData();
        return str;
    }*/

/*
     java中的泛型，在编译后会被擦除，变成一样的原生类型List<E>，导致方法参数一致，无法被重载
     public void method(List<String> list){}

    public void method(List<Integer> list){}
    *//*



    public <T> T getObject(Class<T> c) throws InstantiationException,IllegalAccessException{
         T t = c.newInstance();
         return t;
    }*/
}
