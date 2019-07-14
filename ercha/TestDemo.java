package ReadAgain.howToFind.ercha;

/**
 *  二叉排序树查找
 *  假设无相同的数据
 *  平均时间复杂度：O（log n）
 *
 */

public class TestDemo {
    public static void main(String [] args){
        int [] arr = {10,7,8,6,11,12,5};
        searchTree demoTree = new searchTree();
        for(int data : arr)
        {
            demoTree.createBinTree(data);
        }

        demoTree.printAll(demoTree.root);

        demoTree.findInBinTree(3);
        demoTree.findInBinTree(10);
        demoTree.findInBinTree(11);
    }
}


