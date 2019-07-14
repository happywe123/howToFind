package ReadAgain.howToFind.sailiebiao;

/**
 *  哈希表法
 *  平均时间复杂度：O（1）
 *
 *
 */
public class testHash {
    public static void main(String[] args) {
        int [] arr = {12,67,46,58,36,89,45};
        hashTable demo = new hashTable(arr.length);
        for(int a: arr){
            demo.buildHashTable(a);
        }

        for(int a: arr)
        {
            System.out.println(demo.findInHashTable(a));
        }
    }
}
