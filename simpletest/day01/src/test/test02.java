package test;

/**
 * @date 2022/12/31
 */
public class test02 {
    public static void main(String[] args) {
        int i = 0 ;
        int j = i++;
        int m = j--+1;
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("m = " + m);
    }
}
