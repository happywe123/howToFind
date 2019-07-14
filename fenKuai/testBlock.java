package ReadAgain.howToFind.fenKuai;

/**
 *      分块查找
 *  平均时间复杂度：O(log n)
 *
 */

public class testBlock {
    public static void main(String[] args){
        int [] index = {10,20,30};
        blockSearch demo = new blockSearch(index);
        int [] arr = {3,6,8,12,15,18,21,23,25};
        for(int item : arr)
        {
            demo.insertIntoBlock(item);
        }
        demo.print();
        demo.findInBlock(12);
        demo.findInBlock(13);
    }
}
