package test;

/**
 * @date 2022/12/31
 */
public class TestDebug {
    public static void main(String[] args) {
        ServiceExample s1 = new ServiceExample();
        s1.test();
        ServiceExample2 s2 = new ServiceExample2();
        s2.test();
        int x = 10;
        System.out.println("x = " + x);
        String a = "aaa";
        String b = "bbb";
        System.out.println(b.equals(a));

        
    }
}
