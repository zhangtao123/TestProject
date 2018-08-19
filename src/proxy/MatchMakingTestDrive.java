package proxy;

import java.lang.reflect.Proxy;

/**
 * Created with IntelliJ IDEA.
 * User: User
 * Date: 2018/8/19
 * Time: 0:44
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class MatchMakingTestDrive {
    public static void main(String[] args) {
        MatchMakingTestDrive matchMakingTestDrive = new MatchMakingTestDrive();
        matchMakingTestDrive.driver();
    }


    public void driver() {
        PersonBean joe = new PersonBeanImpl("joe", "joeGender", "bowling", 2, 10);

        //获取代理对象proxy
        PersonBean ownerProxy = getOwnerProxy(joe);

        //调用代理对象的方法--》会调用处理器invocationHandler的invoke()方法
        System.out.println("name is " + ownerProxy.getName());
        ownerProxy.setInterests("bowling,go");
        System.out.println("interests set from ownerProxy");
        try {
            ownerProxy.setHotOrNotRating(8);
        } catch (Exception e) {
            System.out.println("can not hotOrNotRating set from ownerProxy");
        }
        System.out.println("Rating is " + ownerProxy.getHotOrNotRating());


        PersonBean nonOwnerProxy = getNonOwnerProxy(joe);
        try {
            nonOwnerProxy.setInterests("gogo");
        } catch (Exception e) {
            System.out.println("can not interests set from nonOwnerProxy");
        }
        nonOwnerProxy.setHotOrNotRating(8);
        System.out.println("Rating is " + nonOwnerProxy.getHotOrNotRating());
    }


    PersonBean getOwnerProxy(PersonBean person) {
        return (PersonBean) Proxy.newProxyInstance(person.getClass().getClassLoader(), person.getClass().getInterfaces(), new OwnerInvocationHandler(person));
    }


    PersonBean getNonOwnerProxy(PersonBean person) {
        return (PersonBean) Proxy.newProxyInstance(person.getClass().getClassLoader(), person.getClass().getInterfaces(), new NonOwnerInvocationHandler(person));
    }
}