package com.company;

public class Main {

    public static void main(String[] args) {

        DSUv1 tree = new DSUv1(8);

        tree.union(1, 4);
        tree.union(4, 5);
        tree.union(2, 3);
        tree.union(3, 7);
        tree.union(3, 6);
        tree.union(2, 6);

        System.out.println(tree.find(2, 5));
        System.out.println(tree.find(3, 4));

        tree.union(2, 5);

        System.out.println(tree.find(2, 5));
        System.out.println(tree.find(4, 3));
        System.out.println(tree.find(0, 1));

        System.out.println();

        DSUv2 tree2 = new DSUv2(8);

        tree2.union(1, 4);
        tree2.union(4, 5);
        tree2.union(2, 3);
        tree2.union(3, 7);
        tree2.union(3, 6);
        tree2.union(2, 6);

        System.out.println(tree2.find(2, 5));
        System.out.println(tree2.find(3, 4));

        tree2.union(2, 5);

        System.out.println(tree2.find(2, 5));
        System.out.println(tree2.find(4, 3));
        System.out.println(tree2.find(0, 1));
    }
}
