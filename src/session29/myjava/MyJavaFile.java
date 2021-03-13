package session29.myjava;

import session29.mykotlin.MyCustomKotlinFileName;

public class MyJavaFile {
    public static void main(String[] args) {
        //int result = Session29Kt.add1(2, 34);
        int result = MyCustomKotlinFileName.add1(2, 34);
        System.out.println(result);

        int result1 = MyCustomKotlinFileName.findVolume(2, 5);
        System.out.println(result1);
    }

    public static int getArea(int l, int b){
        return l*b;
    }
}
