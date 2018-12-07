package src.exception;

public class ExceT {
    /**
     * java方法中出现异常，如果没被捕获，方法抛出异常到此结束；
     * 如果在方法里面catch到异常，那么方法执行完catch块中的代码，继续try块外代码继续执行
     * 如果在笨方法内没有try块，那么跳出该方法，到父方法中查找是否有try块，过程同上；
     * */
    public String do1() {
        int n = 0;
        System.out.println("1111111111");
        int m = n / 0;
        /*try {
            int m = n / 0;
        } catch (Exception e) {
            System.out.println("55555555555555");
            //return "aaaaaaaaaaaaaa";
            e.printStackTrace();
        }*/

        System.out.println("22222222222");
        return "333333333";
    }


    public void do2() {
        String str = null;
        try {
            str = new ExceT().do1();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(str);
        System.out.println("dddddddd");
    }


    private int[] twoSum(int[] nums, int target) {
        int len  = nums.length;
        for(int i = 0;i<len;i++){
            for(int j = 0;j<len;j++){
                if(j!=i && nums[i]+nums[j]==target){
                    int[] arr = new int[2];
                    arr[0] = nums[i];
                    arr[1] = nums[j];
                    return arr;
                }
            }
        }
        return null;
    }




    public static void main(String[] args) {
        //new ExceT().do2();
        int[] aa = {2,7,11,15};
        System.out.println(new ExceT().twoSum(aa,9));
    }
}
