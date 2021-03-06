package src;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.StringUtils;
import src.util.CommonConstants;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.Lock;
import java.util.stream.Collectors;

/**
 * Created with IntelliJ IDEA.
 * User: User
 * Date: 2018/8/2
 * Time: 15:37
 * To change this template use File | Settings | File Templates.
 * Description:测试代码
 */
public class TestMap {


    public static void do1() {
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


    public static void do2() {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(3, "111");


        Integer in = map.keySet().iterator().next();
        System.out.println(in);

        System.out.println(map.size());
    }


    public static void do3() {
        Map<String, Integer> map = new HashMap();
        map.put("11", 8);
        map.put("12", 12);
        map.put("13", 53);
        map.put("14", 33);
        map.put("15", 11);
        map.put("16", 3);
        map.put("17", 3);
        List<Map.Entry<String, Integer>> list = new ArrayList(map.entrySet());
        Collections.sort(list, (o1, o2) -> (o2.getValue() - o1.getValue()));
        System.out.println(list.get(0).getKey());
        System.out.println(list.get(1).getKey());
    }


    public static void do4() {
        Map<String, Integer> map = new IdentityHashMap();
        for (int i = 0; i < 4; i++) {
            map.put(String.valueOf(i), i + i);
            map.put(String.valueOf(i), i + i);
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


    public static void t1() {
        System.out.println("11111111");
        String rs = t2();
        System.out.println("22222222");
    }

    public static String t2() {
        int i = 5 / 0;
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


    public static String do6() {
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
        personGroups.forEach((a, b) -> System.out.println(a + ";" + b));
        ConcurrentHashMap con = new ConcurrentHashMap();
        Hashtable tab = new Hashtable();

        return null;
    }


    public static void do7() {
        int n = 1 << 30;
        System.out.println(n);
    }

    final Object[] items;

    public TestMap() {
        this.items = new Object[8];
    }


    public void do8() {
        ArrayBlockingQueue array = new ArrayBlockingQueue(10);
        array.peek();
        array.remove();
    }

    //+43  -45  48~57
    public static void do9() {
        char c = '9';
        System.out.println((int) c);
    }


    public static void do10(int n) {
        if (n == 6) {
            System.out.println(n);
        } else if (n > 2) {
            System.out.println(n);
        } else {
            System.out.println(n);
        }
    }


    public static void do11() {
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(6);
        list.add(3);
        list.add(88);
        list.add(16);
        list.sort(Comparator.comparingInt(o -> o));
        //list.sort((o1, o2) -> (o1.intValue() - o2.intValue()));
        System.out.println(list);

    }


    public static void do12() {
        String str = "1,6,3,88,16";
        String[] arr = str.split(",");
        List<Integer> list = new ArrayList<>();
        for (String str1 : arr) {
            list.add(Integer.valueOf(str1));
        }
        //System.out.println(list.get(0).getClass().getName());
        System.out.println(list);
        list.remove(Integer.valueOf(6));
        list.remove(Integer.valueOf(88));
        System.out.println(list);
    }


    public static void do13() {
        List<String> supperList = null;
        for (String list : supperList) {
            System.out.println(11111);
        }

    }


    public static void do14() {
        String line = "江苏,淮安市|江苏,南京市";
        String[] str = line.split("\\|");
        System.out.println(str.toString());
        System.out.println(str[1]);
    }


    public static void do15() {
        String line = "（埠蚌（国际）";
        int head = line.indexOf('(');
        System.out.println(head);
    }


    public static void do16() {
        Person p = new Person();
        if (1 == p.getAge()) {
            System.out.println("111" + p.getAge());
        } else {
            System.out.println("222" + p.getAge());
        }


    }


    public static void do17() {
        String str = "南京911";
        System.out.println(str.indexOf("2"));
        System.out.println(str.substring(0, str.indexOf("2")));
    }


    public static void do18() {
        List<String> list = new ArrayList<>();
        list.add("111");
        list.add("333");
        list.add("666");
        String str = StringUtils.join(list, ",");
        System.out.println(str);
    }


    public static void do19() {
        Map<String, Object> map = new HashMap<>();
        map.put("111", "qqq");
        map.put("222", "aaa");
        map.put("333", "sss");
        String str = JSONObject.toJSONString(map);
        JSONObject json = JSONObject.parseObject(str);

        System.out.println(str);
        System.out.println(json);
    }


    public static void do20() {
        String[] arr = {"111", "222", "333"};
        String str2 = ArrayUtils.toString(arr, ",");
        System.out.println(str2);
        String str3 = StringUtils.join(arr, ",");
        System.out.println(str3);
    }

    public static void do21() {
        String arr = "  q q q   ";
        System.out.println(arr.length());
        String str2 = arr.trim();
        System.out.println(str2.length());
        System.out.println(str2);
    }


    /*finally语句块是跟随在try{}后面的，当try执行结束后或者try中抛出异常了，才执行finally语句块*/
    public static void do22() {
        try {
            String arr = "  q q q   ";
            System.out.println(arr.length());
            int n = 1 / 0;
            String str2 = arr.trim();
            System.out.println(str2.length());
            System.out.println(str2);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("执行finally操作");
        }
        System.out.println("方法结束");
    }


    public static void do23(int n) {
        for (int i = 0; i < 5; i++) {
            n = (n * 5) + 1;
        }
        System.out.println(n);
    }


    public static void do24() {

        String str = "   ";
        System.out.println(str.length());
        System.out.println(StringUtils.isBlank(" "));

    }



    public static void do25() {

        String str = "///business/test";
        System.out.println(str.length());
        System.out.println(StringUtils.isBlank(" "));
    }



    public static void do26() {

        Thread t = new Thread(() -> System.out.println("1111"), "123");
        t.start();

    }

    public static void do27() {
        DecimalFormat df2 = new DecimalFormat("###.00");
        Double d = 2.3;
        System.out.println(df2.format(d));
    }



    public static void do28(){
        SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");//设置日期格式
        System.out.println(df.format(LocalDateTime.now()));
    }


    public static void do29(){
        String str = "  ";
        String[] arr = str.split("\\s+");
        System.out.println(arr.length);
        List<String> list =  Arrays.asList(arr);
        System.out.println(list);
    }


    public static void do30(){
        Person p = new Person();
        p.setAge(10);
        p.setName("111");
        System.out.println(JSON.toJSONString(p, CommonConstants.FEATURES));
        String p2 = "sssss";
        System.out.println(JSON.toJSONString(p2, CommonConstants.FEATURES));
        int p3 = 123;
        System.out.println(JSON.toJSONString(p3, CommonConstants.FEATURES));

    }


    public static void main(String[] args) {
        do30();
    }
}