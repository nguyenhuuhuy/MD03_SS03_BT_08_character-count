package Dem_Ky_Tu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào 1 chuỗi: ");
        String array = sc.nextLine();
        System.out.println("Chuỗi vừa nhập là: " + array);
        String x;
        do {
            System.out.println("Nhập ký tự muốn tìm:");
            x = sc.nextLine();
            if (x.length() > 1)
                System.out.println("Vui lòng nhập 1 ký tự.");
        } while (x.length() > 1);
        for (int i = 0; i < array.length(); i++) {
            if (array.charAt(i) == x.charAt(0)) {
                count += 1;
            }
        }
        System.out.println("số lần ký tự xuất hện trong chuỗi là " + count + " lần");
    }
}
