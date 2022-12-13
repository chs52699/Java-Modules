import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int[] arr = new int[]{20,51,23,56,78};
        String arr_toString = Arrays.toString(arr);
        String repl = arr_toString.replaceAll("\\[","").replaceAll("\\]","");


        System.out.println("Arrays.toString을 활용한 배열 출력 : " + arr_toString);
        System.out.println("Arrays.toString의 길이 : " + arr_toString.length());
        System.out.println("Arrays.toString의 괄호 지우고 출력 : " + repl);
    }
}