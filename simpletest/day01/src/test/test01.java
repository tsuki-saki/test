package test;

import java.util.ArrayList;

/**
 * @date 2022/12/31
 */
public class test01 {


    public static void main(String[] args) {
        System.out.println("hello world");
        int i = 100;
        System.out.println("i = " + i);
        //region Description
        ArrayList<String> a = new ArrayList<>();
        a.add("aaa");
        a.add("bbb");
        a.add("ccc");
        a.forEach(System.out::println);

        int x=1;

        for (String s : a) {

        }

        //endregion


    }

    /**
     *
     * @param x  这是被加数
     * @param y  这是加数
     * @return
     */
    public static int add(int x,int y) {
        return x+y;

    }
    private int age;
//alt + insert

//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public test01(int age) {
//        this.age = age;
//    }
}
