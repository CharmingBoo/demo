package com.example.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * Soulution102
 * @author wangzhao
 * @version [版本号, 2019/3/14]
 * @see  [相关类/方法]
 * @since [产品/模块版本]
 */
public class BinaryTree
{

    /**
     * 二叉树的前序遍历
     * Binary Tree Preorder Traversal
     * @param root
     * @return
     */
    public List<Integer> preorderTraversal(TreeNode root)
    {
        List<Integer> list = new ArrayList<>();
        preInnterally(root,list);
        return list;
    }

    private void preInnterally(TreeNode root,List<Integer> list)
    {

        if(root == null)
        {
            return;
        }
        list.add(root.val);

        preInnterally(root.left,list);
        preInnterally(root.right,list);

    }




    public List<List<Integer>> levelOrder(TreeNode root)
    {
        List<List<Integer>> result = new ArrayList<>();
        internally(root,0,result);

        return result;
    }

    public void internally(TreeNode root,int index,List<List<Integer>> result)
    {

        if(root == null)
        {
            return;
        }
        List<Integer> temp ;
        if(result.size()>index)
        {
            temp = result.get(index);
            temp.add(root.val);
        }
        else
        {
            temp = new ArrayList<>();
            temp.add(root.val);
            result.add(temp);
        }

        internally(root.left,index+1,result);
        internally(root.right,index+1,result);
    }

    public static void main(String[] args)
    {
        TreeNode treeNode = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        treeNode.left = treeNode2;

        BinaryTree binaryTree = new BinaryTree();
        binaryTree.levelOrder(treeNode);
    }

}
