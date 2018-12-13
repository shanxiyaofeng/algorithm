package com.shanxiyaofeng.algorithm;

public class BinarySearch {
    static int findTimes = 0;

    public static void main(String[] args) {
        int[] intArr = {1, 3, 5, 7, 9, 11, 13, 17, 19, 23};
        int index = binarySearch(intArr, 5, intArr.length, 1);
        System.out.println("查找次数：" + findTimes);
        System.out.println("查找数据在数组中的位置：" + index);
    }

    public static int binarySearch(int[] intArr, int start, int end, int findNum) {
        findTimes++;
        int mid = (end - start) >>> 1 + start;
        System.out.println(mid);
        if (start > end) {
            return -1;
        }
        if (intArr[mid] > findNum) {
            return binarySearch(intArr, start, mid-1, findNum);
        } else if (intArr[mid] < findNum) {
            return binarySearch(intArr, mid+1, end, findNum);
        } else {
            return mid;
        }
    }
}
