package src.thread.package10;

public class NameSpace {

    public static void main(String[] args) throws ClassNotFoundException {
        ClassLoader classLoader = NameSpace.class.getClassLoader();
        Class<?> aClass = classLoader.loadClass("src.thread.package10.BootStrapClassLoader");
        Class<?> bClass = classLoader.loadClass("src.thread.package10.BootStrapClassLoader");
        System.out.println(aClass.hashCode());
        System.out.println(bClass.hashCode());
        System.out.println(aClass == bClass);
    }
}
