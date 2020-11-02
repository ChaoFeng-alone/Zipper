import sun.reflect.generics.tree.Tree;

import java.util.*;

public class Huffman {
    //哈夫曼树
    TreeNode tree = null;
    //遍历结果串
    private String preorderstring;
    private String midorderstring;
    //密码表
    ArrayList<code> codes = new ArrayList<>();

    String getcode(int find){
        for (code c:codes) {
            if(c.name==find){
                return c.code;
                }
            }
        return "";
        }


    void creatHuffmanTree(int[] weight) {
        int length = weight.length;
        ArrayList<TreeNode> nodes = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            nodes.add(new TreeNode((char) (i + 65), weight[i]));
        }

        //开始构建,权重小的放左边

        //临时指针
        TreeNode tmp;

        while (nodes.size() > 1) {
            nodes.sort(new Comparator<TreeNode>() {
                @Override
                public int compare(TreeNode o1, TreeNode o2) {
                    if (o1.weight > o2.weight)
                        return 1;
                    else
                        return -1;
                }
            });
            tmp = new TreeNode();
            tmp.weight = nodes.get(0).weight + nodes.get(1).weight;
            tmp.lchild = nodes.get(0);
            tmp.rchild = nodes.get(1);
            nodes.remove(0);
            nodes.remove(0);


            nodes.add(tmp);
        }
        tree = nodes.get(0);

        //构建完毕

        //深度遍历做密码表
        makeCodes();
    }

    String preorder() {
        preorderstring = "";
        preorder(tree);
        return preorderstring;
    }

    private void preorder(TreeNode tmp) {
        if (tmp.name != ' ')
            preorderstring += tmp.name;
        if (tmp.lchild != null)
            preorder(tmp.lchild);
        if (tmp.rchild != null)
            preorder(tmp.rchild);
        return;
    }

    String midorder() {
        midorderstring = "";
        midorder(tree);
        return midorderstring;
    }

    private void midorder(TreeNode tmp) {
        if (tmp.lchild != null)
            midorder(tmp.lchild);
        if (tmp.name != ' ')
            midorderstring += tmp.name;
        if (tmp.rchild != null)
            midorder(tmp.rchild);
        return;
    }

    private void makeCodes() {
        makeCodes(tree, "");
    }

    //左0右1
    private void makeCodes(TreeNode tmp, String road) {
        if (tmp.lchild == null && tmp.rchild == null) {
            codes.add(new code(tmp.name, road));
            return;
        }
        if (tmp.lchild != null) {
            makeCodes(tmp.lchild, road+ "0");
        }
        if (tmp.rchild != null) {
            makeCodes(tmp.rchild, road + "1");
        }
    }

    class code {
        char name;
        String code;

        code(char name, String code) {
            this.name = name;
            this.code = code;
        }

        @Override
        public String toString() {
            return name+"["+code+"]";
        }
    }
}

class TreeNode implements Comparable<TreeNode> {
    char name;
    int weight;
    TreeNode lchild;
    TreeNode rchild;

    TreeNode() {
        name = ' ';
        weight = 0;
        lchild = null;
        rchild = null;
    }

    public TreeNode(char name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return name + "[" + weight + "]";
    }

    @Override
    public int compareTo(TreeNode o) {
        if (o.weight > this.weight)
            return -1;
        else
            return 1;
    }
}