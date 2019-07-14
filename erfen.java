package ReadAgain.howToFind;

/**
 * 二分查找，要求为有序是数组
 * 平均时间复杂度：O(log n)
 */
public class erfen {


    // 查找第一个等于给定值的元素
    public int FirstBinaryFind(int [] arr, int key)
    {
        if(arr.length == 0 || arr == null)
            return -1;

        int left = 0;
        int right = arr.length - 1;
        while(left <= right)
        {
            int mid = right + ((left - right) >> 1);
            if(arr[mid] > key)
                right = mid - 1;
            else if( key > arr[mid] )
                left = mid + 1;
            else
            {
                if(mid == 0 || arr[mid - 1] != key)
                    return mid;
                else
                    right = mid - 1;
            }
        }

        return -1;
    }

    // 查找最后一个等于给定值的元素
    public int LastBinaryFind(int [] arr, int key)
    {
        if(arr.length == 0 || arr == null)
            return -1;

        int left = 0;
        int right = arr.length - 1;
        while(left <= right)
        {
            int mid = right + ((left - right) >> 1);
            if(arr[mid] > key)
                right = mid - 1;
            else if( key > arr[mid] )
                left = mid + 1;
            else
            {
                if(mid == arr.length - 1 || arr[mid + 1] != key)
                    return mid;
                else
                    left = mid + 1;
            }
        }
        return -1;
    }

    // 查找第一个 >= 给定值的元素
    public int FirstBigBinaryFind(int [] arr, int key)
    {
        if(arr.length == 0 || arr == null)
            return -1;

        int left = 0;
        int right = arr.length - 1;
        while(left <= right)
        {
            int mid = right + ((left - right) >> 1);
            if(arr[mid] >= key)
            {
                if(mid == 0 || arr[mid - 1] != key)
                    return mid;
                else
                    right = mid - 1;
            }
            else
                left = mid + 1;

        }
        return -1;
    }

    // 查找最后一个 <= 给定值的元素
    public int LastBigBinaryFind(int [] arr, int key)
    {
        if(arr.length == 0 || arr == null)
            return -1;

        int left = 0;
        int right = arr.length - 1;
        while(left <= right)
        {
            int mid = right + ((left - right) >> 1);
            if(arr[mid] >= key)
            {
                if(mid == arr.length - 1 || arr[mid + 1] != key)
                    return mid;
                else
                    left = mid + 1;
            }
            else
                left = mid + 1;
        }
        return -1;
    }

    // 查找给定值
    public int BinaryFind(int [] arr, int key)
    {
        if(arr.length == 0 || arr == null)
            return -1;

        int left = 0;
        int right = arr.length - 1;
        while(left <= right)
        {
            int mid = left + ((right - left) >> 1);
            if(arr[mid] < key)
                left = mid + 1;
            else if(arr[mid] > key)
                right = mid - 1;
            else
                return mid;
        }
        return -1;
    }

    public static void main(String[] args)
    {
        int [] arr = {2,4,11,11,11,14,17,19,32,35,43,56};
        erfen demo = new erfen();

        int re = demo.BinaryFind(arr,17);
        if(re == -1)
            System.out.println("没有这个玩意！");
        else
            System.out.println("给定值 17 在数组的第" + re + "处！" );

        int re1 = demo.FirstBinaryFind(arr,11);
        if(re1 == -1)
            System.out.println("没有这个玩意！");
        else
            System.out.println("第一个等于 11 在数组的第" + re1 + "处！" );

        int re2 = demo.LastBinaryFind(arr,11);
        if(re2 == -1)
            System.out.println("没有这个玩意！");
        else
            System.out.println("最后一个等于 11 在数组的第" + re2 + "处！" );

        int re3 = demo.FirstBigBinaryFind(arr,13);
        if(re3 == -1)
            System.out.println("没有这个玩意！");
        else
            System.out.println("第一个大于等于 13 在数组的第" + re3 + "处！" );

        int re4 = demo.LastBigBinaryFind(arr,32);
        if(re4 == -1)
            System.out.println("没有这个玩意！");
        else
            System.out.println("最后一个小于等于 32 在数组的第" + re4 + "处！" );
    }

}
