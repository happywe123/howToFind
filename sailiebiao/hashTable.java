package ReadAgain.howToFind.sailiebiao;

/**
 *      散列查找
 *  平均时间复杂度：O(1)
 */

public class hashTable {
    int [] elem;   // 原始容器，用于存储元素
    int count;     // 容器的长度

    private static final int NUllKEY = -32768;   // 用来初始化容器

    // 构造函数，初始化容器数组
    public hashTable(int count)
    {
        this.count = count;
        elem = new int [count];
        for(int i = 0; i < count; i++)
            elem[i] = NUllKEY;
    }

    // 返回元素的哈希值
    public int hash(int key)
    {
        return key % count;
    }

    // 构建哈希表
    public void buildHashTable(int key)
    {
        int addr = hash(key);
        while(elem[addr] != NUllKEY)
        {
            addr = (addr + 1) % count;
            if(addr == hash(key))   // 回到原点，说明容器数组已满
            {
                System.out.println("容器已满，你自己看着办！");
                return;
            }
        }
        elem[addr] = key;
    }

    // 查找
    public boolean findInHashTable(int key)
    {
        int addr = hash(key);
        while(elem[addr] != key)
        {
            addr = (addr + 1) % count;
            if(addr == hash(key) || elem[addr] == NUllKEY)
            {
                System.out.println("这里没有你要找的东西！");
                return false;
            }
        }
        System.out.println("你要找的东西是不是在容器第" + addr + "个");
        return true;
    }
}
