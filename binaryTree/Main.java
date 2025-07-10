// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    
    static class Node{
        int data;
        Node left;
        Node right;
        
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    
   static class binaryTree{
     static  int idx =-1;
       public static Node buildTree(int[] nodes){
           idx++;
           if(nodes[idx] == -1){
           return null;
       };
       Node newNode = new Node(nodes[idx]);
       newNode.left= buildTree(nodes);
       newNode.right= buildTree(nodes);
       return newNode;
       }
       
   }
   
   public static void preorder(Node root){
       if(root == null) return;
       
      System.out.println(root.data + " ");
      preorder(root.left);
      preorder(root.right);
   }
   
   public static void inorder(Node root){
       if(root == null) return;
       
      preorder(root.left);
      System.out.println(root.data + " ");
      preorder(root.right);
   }
   
   public static void postorder(Node root){
       if(root == null) return;
       
      preorder(root.left);
      preorder(root.right);
      System.out.println(root.data + " ");
   }
   
   public static void level(Node root){
       Queue<Node> q = new LinkedList<>();
       q.add(root);
       q.add(null);
       
       while(!q.isEmpty()){
           Node curr = q.remove();
           if(curr == null){
               System.out.println();
               if(q.isEmpty()){
                   break;
               }else{
                   q.add(null);
               }
           }else{
               System.out.print(curr.data + " ");
               if( curr.left != null){
                   q.add(curr.left);
               }
               if(curr.right != null){
                   q.add(curr.right);
               }
               
           }
       }
   }
    
    
    public static int height(Node root){
        if(root == null){
            return 0;
        }
        int left = height(root.left);
        int right = height(root.right);
        
        return Math.max(left , right) +1;
    }
    public static int count(Node root){
        if(root == null){
            return 0;
        }
        int left = count(root.left);
        int right = count(root.right);
        
        return left+right+1;
    }
    public static int sum(Node root){
        if(root == null){
            return 0;
        }
        int left = sum(root.left);
        int right = sum(root.right);
        
        return left+right+root.data;
    }
    
    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
     binaryTree tree = new binaryTree();
      
       Node root = tree.buildTree(nodes);
    // preorder(root);
    // postorder(root);
    // inorder(root);
    // level(root);
    System.out.println(height(root));
    System.out.println(count(root));
    System.out.println(sum(root));
    
    }
}

