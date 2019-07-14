package ReadAgain.howToFind;

/**
 *      顺序查找
 *  平均时间复杂度：O(n)
 */

public class shunxu {

    public int findInSort(int [] arr,int key)
    {
        if(arr.length == 0 || arr == null)
            return -1;

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] == key)
                return i;
        }
        return -1;
    }

    public static void main(String [] args)
    {
        int arr [] = {1,2,3,4,5,6,7,8,9,10};
        shunxu demo = new shunxu();
        int rs = demo.findInSort(arr,5);
        if(rs == -1)
        {
            System.out.println("这玩意不在！");
        }
        else
        {
            System.out.println("这玩意在数组中的第" + rs + "个位置！");
        }

    }


}
