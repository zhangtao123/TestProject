package src.thread.package10;

public class BootStrapClassLoader {
    public static void main(String[] args) {
        System.out.println("BootStrap:" + String.class.getClassLoader());
        System.out.println(System.getProperty("sun.boot.class.path"));
        System.out.println(System.getProperty("java.ext.dirs"));
        System.out.println(System.getProperty("java.class.path"));
        System.out.println(BootStrapClassLoader.class.getClassLoader());
    }
}
