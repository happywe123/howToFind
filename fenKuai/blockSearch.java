package ReadAgain.howToFind.fenKuai;

import java.util.ArrayList;

/**
 *      分块查找
 *  平均时间复杂度：O（log n）
 */

public class blockSearch {
    int [] index;  // 用来表示容器的总块
    // 实际存储元素的块，这里采用的是二维动态数组
    ArrayList<ArrayList<Integer>> list = new ArrayList<>();

    // 初始化容器
    public blockSearch(int [] index)
    {
        this.index = index; // index 的长度就是需要分的块数
        for(int i = 0; i < index.length; i++)
            list.add(new ArrayList<>());
    }

    // 选择相应的块，进行存储
    public void insertIntoBlock(int key)
    {
        int i = whichBlock(key);
        list.get(i).add(key);
    }

    // 判断当前元素属于哪一个块
    public int whichBlock(int key)
    {
        int start  = 0;
        int end = index.length - 1;
        while(start <= end)
        {
            int mid = start + ((end - start) >> 1);
            if(index[mid] <= key)
            {
                start = mid + 1;
            }
            else
            {
                end = mid - 1;
            }
        }
        return start;
    }

    // 顺序打印
    public void print()
    {
        for(int i = 0; i < list.size(); i++ )
        {
            ArrayList<Integer> ll = list.get(i);
            System.out.println("当前" + i + "个容器内的数据为：");
            for(int j = 0; j < ll.size(); j++)
            {
                System.out.println(ll.get(j));

            }
        }
    }

    // 查找
    public boolean findInBlock(int key)
    {
        int i = whichBlock(key);
        ArrayList<Integer> ll = list.get(i);
        for(int j = 0; j < ll.size(); j++)
        {
            if(ll.get(j) == key)
            {
                System.out.println(key + "找到了，在第" + i + "个区内");
                return true;
            }
        }
        return false;
    }
}
