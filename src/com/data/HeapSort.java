package com.data;
import java.util.Arrays;

public class HeapSort {
    public static void main(String[] args) {
        int[] arr = {4,6,8,5,9};
        heapSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    //堆排序
    public static void heapSort(int[] arr) {
        //将无序序列构建成一个堆
        for (int i = arr.length / 2 - 1; i >= 0; i--) {
            adjustHeap(arr, i, arr.length);
        }
        //将堆顶元素和末尾元素交换,将最大元素放置数组末端
        //重新调整至堆结构,然后继续将堆顶元素和当前末尾元素交换,以此往复
        for (int i = arr.length - 1; i > 0; i--) {
            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;
            adjustHeap(arr, 0, i);
        }
    }

    /**
     * 将二叉树调整为堆
     *
     * @param arr    待调整的数组
     * @param i      表示非叶子结点在数组中索引
     * @param length 表示对多少个元素继续调整,length逐渐减少
     */
    public static void adjustHeap(int[] arr, int i, int length) {
        int temp = arr[i];
        //k=2i+1是i的左子节点
        for (int k = i * 2 + 1; k < length; k = k * 2 + 1) {
            if (k + 1 < length && arr[k] < arr[k + 1])//左子节点的值<右子节点的值
                k++;//指向右节点
            if (arr[k] > temp) {//如果子结点的值>父节点的值
                arr[i] = arr[k];//将较大的值赋给当前节点
                i = k;//i指向k,继续循环比较
            } else
                break;
        }
        //for循环后,已经将以i为父结点的树的最大值,放在了顶部
        arr[i] = temp;//将temp值放到调整后的位置
    }
}
