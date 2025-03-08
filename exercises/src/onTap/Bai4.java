package onTap;

import java.util.Scanner;

public class Bai4 {
    private int[] arr;

    public Bai4() {
    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    private void input() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so luong phan tu cua mang: ");
        int n = scanner.nextInt();

        System.out.println("Nhap cac so nguyen (ma ASCII) cach nhau boi dau cach:");
        arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = scanner.nextInt();

        setArr(arr);

        scanner.close();
    }

    private void convertToASCII() {
        System.out.print("Chuoi ky tu tuong ung: ");
        for (int i = 0; i < arr.length; i++)
            System.out.print((char) arr[i]);

    }

    public void show() {
        input();
        convertToASCII();
    }
}
