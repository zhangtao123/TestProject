package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created with IntelliJ IDEA.
 * User: User
 * Date: 2018/8/19
 * Time: 0:20
 * To change this template use File | Settings | File Templates.
 * Description:（调用处理器）看别人时，只能查看和打分，不能修改别人的信息；
 * 当代理（proxy）的方法被调用时，代理就会把这个调用转发给InvocationHandler，执行InvocationHandler中的invoke()方法，
 * 不管代理被调用的是何种方法，处理器调用的一定是invoke()方法，在invoke中决定如何处置这个请求，可能会转发给RealSubject
 */
public class NonOwnerInvocationHandler implements InvocationHandler {

    PersonBean person;

    public NonOwnerInvocationHandler(PersonBean person) {
        this.person = person;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        try {
            if (method.getName().startsWith("get")) {
                return method.invoke(person, args);
            } else if (method.getName().equals("setHotOrNotRating")) {
                return method.invoke(person, args);
            } else if (method.getName().startsWith("set")) {
                throw new IllegalAccessException();
            }
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }
}