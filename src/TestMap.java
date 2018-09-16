import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

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

    public static void main(String[] args) {
        do3();
    }
}