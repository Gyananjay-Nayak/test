package Tree;

import java.util.Scanner;

public class tree {
    static Scanner sc = null;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        Node root= creatTree();

        System.out.println(root.left.data);
    }

    static Node creatTree(){
        Node root = null;
        System.out.println("Enter the data: ");
        int data = sc.nextInt();
    
        if(data==-1){
            return null;
        }
    
        root= new Node(data);
    
        System.out.println("Enter left for "+ data);
        root.left= creatTree();
    
        System.out.println("Enter right for "+ data);
        root.right= creatTree();
    
        return root;
    
    }
}


class Node{
    Node left, right;
    int data;

    public Node(int data){
        this.data= data;
        
    }
}