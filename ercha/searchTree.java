package ReadAgain.howToFind.ercha;

/**
 *  二叉搜索树,二叉排序树，二叉查找树
 */

public class searchTree {
    public TreeNode root = null;

    // 创建二叉树
    public void createBinTree(int data)
    {
        if(root == null)
        {
            root = new TreeNode(data);
            System.out.println("该节点作为根节点成功插入二叉树！");
            return;
        }

        TreeNode newNode = new TreeNode(data);
        TreeNode currentNode = root;
        TreeNode pNode;  // pNode 作为 currentNode 的标记节点，走在 currentNode 的后面

        while(true)
        {
            pNode = currentNode;
            if(currentNode.data > data)
            {
                currentNode = currentNode.left;
                if(currentNode == null)
                {
                    pNode.left = newNode;
                    newNode.parent = pNode;
                    System.out.println("该节点已作为左子节插入！");
                    return;
                }
            }
            else
            {
                currentNode = currentNode.right;
                if(currentNode == null)
                {
                    pNode.right = newNode;
                    newNode.parent = pNode;
                    System.out.println("该节点已作为右子节插入");
                    return;
                }
            }
        }
    }

    // 前序遍历二叉树
    public void printAll(TreeNode root)
    {
        if(root != null)
        {
            System.out.println(root.data);
            printAll(root.left);
            printAll(root.right);
        }
    }

    // 查找二叉树
    public boolean findInBinTree(int data)
    {
        if(root.data == data){
            return true;
        }
        TreeNode current = root;
        while(current != null)
        {
            if(current.data > data)
            {
                current = current.left;
            }
            else if(current.data < data)
            {
                current = current.right;
            }
            else
            {
                System.out.println("找到"+ data + "这个玩意了，！");
                return true;
            }
        }
        return false;
    }

}
