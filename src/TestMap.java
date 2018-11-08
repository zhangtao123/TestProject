import src.Person;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

/**
 * Created with IntelliJ IDEA.
 * User: User
 * Date: 2018/8/2
 * Time: 15:37
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class TestMap {



    public static void do1(){
//        Map<String,Object> map1 = new ConcurrentHashMap<String, Object>();
//
//        Map<String,Object> map2 = Collections.synchronizedMap();
//
//        List<Integer> list = new LinkedList<Integer>();

        StringBuffer sb = new StringBuffer();
        sb.append("aaa");


        StringBuilder sb1 = new StringBuilder();
        sb1.append("aaa");

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        sdf.format(new Date());
    }


    public static void do2(){
        Map<Integer,String> map = new HashMap<Integer,String>();
        map.put(3,"111");



        Integer in = map.keySet().iterator().next();
        System.out.println(in);

        System.out.println(map.size());
    }



    public static void do3(){
        Map<String, Integer> map = new HashMap();
        map.put("1", 8);
        map.put("2", 12);
        map.put("3", 53);
        map.put("4", 33);
        map.put("5", 11);
        map.put("6", 3);
        map.put("7", 3);
        List<Map.Entry<String,Integer>> list = new ArrayList(map.entrySet());
        Collections.sort(list, (o1, o2) -> (o2.getValue() - o1.getValue()));
        System.out.println(list.get(0).getKey());
        System.out.println(list.get(1).getKey());
    }



    public static void do4(){
        Map<String, Integer> map = new IdentityHashMap();
        for (int i= 0;i<4;i++){
            map.put(String.valueOf(i),i+i);
            map.put(String.valueOf(i),i+i);
        }
        Set<Map.Entry<String, Integer>> set = map.entrySet();
        System.out.println(set);
       /* Object[] array = set.toArray();
        System.out.println(map.size());*/
        /*Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(4);
        set1.add(6);
        System.out.println(set1);*/
    }


    public static void t1(){
        System.out.println("11111111");
        String rs = t2();
        System.out.println("22222222");
    }

    public static String t2(){
        int i = 5/0;
        return "11";
    }


    public static void do5() {

        Person p1 = new Person("qq", 12);
        Person p2 = new Person("ww", 13);
        Person p3 = new Person("ee", 14);
        Person p4 = new Person("rr", 15);
        Person p5 = new Person("tt", 16);
        Person p6 = new Person("yy", 17);
        Person p7 = new Person("uu", 18);
        Person p8 = new Person("pp", 19);
        List<Person> list1 = new ArrayList<>();
        list1.add(p1);
        list1.add(p2);

        List<Person> list2 = new ArrayList<>();
        list2.add(p3);
        list2.add(p4);

        List<Person> list3 = new ArrayList<>();
        list3.add(p5);
        list3.add(p6);

        List<Person> list4 = new ArrayList<>();
        list4.add(p7);
        list4.add(p8);

        Map<String, List<Person>> map = new HashMap<>();
        map.put("1", list1);
        map.put("2", list2);
        map.put("3", list3);
        map.put("4", list4);
        Set<Map.Entry<String, List<Person>>> set1 = map.entrySet();

        List<Map.Entry<String, List<Person>>> set2 = new ArrayList<>(set1);

        List<Map.Entry<String, List<Person>>> set3 = new ArrayList<>(map.entrySet());

        System.out.println(set1);
        System.out.println(set2);
        System.out.println(set3);
    }



    public static String do6(){
        Person p1 = new Person("", 12);
        Person p2 = new Person("ww", 13);
        Person p3 = new Person("ww", 14);
        Person p4 = new Person("rr", 15);
        Person p5 = new Person("", 15);
        List<Person> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        list.add(p5);
        Map<String, List<Person>> personGroups = list.stream().collect(Collectors.groupingBy(Person::getName));
        personGroups.forEach((a,b)-> System.out.println(a+";"+b));
        ConcurrentHashMap con = new ConcurrentHashMap();
        Hashtable tab = new Hashtable();

        return null;
    }


    public static void do7(){
        int n = 1 << 30;
        System.out.println(n);
    }

    final Object[] items;
    public TestMap() {
        this.items = new Object[8];
    }



    public void do8(){
        ArrayBlockingQueue array = new ArrayBlockingQueue(10);
        array.peek();
        array.remove();
    }


    public static void main(String[] args) {
        do7();
    }
}