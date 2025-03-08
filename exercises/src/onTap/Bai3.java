package onTap;

public class Bai3 {
    private int[] arr;

    public Bai3(int[] arr) {
        this.arr = arr;
    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public void show() {
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
    }

}
