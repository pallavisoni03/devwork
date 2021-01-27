package com.pal.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinaryTreePrinter {

    public static String getFormattedTreeAsString(TreeNode root) {
        int maxLevel = maxLevel(root);

        return printNodeInternal(Collections.singletonList(root), 1, maxLevel);
    }

    private static String printNodeInternal(List<TreeNode> nodes, int level, int maxLevel) {
        StringBuilder stringBuilder = new StringBuilder();

        if (nodes.isEmpty() || BinaryTreePrinter.isAllElementsNull(nodes))
            return stringBuilder.toString();

        int floor = maxLevel - level;
        int endgeLines = (int) Math.pow(2, (Math.max(floor - 1, 0)));
        int firstSpaces = (int) Math.pow(2, (floor)) - 1;
        int betweenSpaces = (int) Math.pow(2, (floor + 1)) - 1;

        BinaryTreePrinter.printWhitespaces(stringBuilder, firstSpaces);

        List<TreeNode> newNodes = new ArrayList<>();
        for (TreeNode node : nodes) {
            if (node != null) {
                System.out.print(node.val);
                stringBuilder.append(node.val);
                newNodes.add(node.left);
                newNodes.add(node.right);
            } else {
                newNodes.add(null);
                newNodes.add(null);
                System.out.print(" ");
                stringBuilder.append(" ");
            }

            BinaryTreePrinter.printWhitespaces(stringBuilder, betweenSpaces);
        }
        System.out.println("");
        stringBuilder.append(System.lineSeparator());

        for (int i = 1; i <= endgeLines; i++) {
            for (int j = 0; j < nodes.size(); j++) {
                BinaryTreePrinter.printWhitespaces(stringBuilder, firstSpaces - i);
                if (nodes.get(j) == null) {
                    BinaryTreePrinter.printWhitespaces(stringBuilder, endgeLines + endgeLines + i + 1);
                    continue;
                }

                if (nodes.get(j).left != null) {
                    System.out.print("/");
                    stringBuilder.append("/");
                }
                else
                    BinaryTreePrinter.printWhitespaces(stringBuilder, 1);

                BinaryTreePrinter.printWhitespaces(stringBuilder, i + i - 1);

                if (nodes.get(j).right != null) {
                    System.out.print("\\");
                    stringBuilder.append("\\");
                }
                else
                    BinaryTreePrinter.printWhitespaces(stringBuilder, 1);

                BinaryTreePrinter.printWhitespaces(stringBuilder, endgeLines + endgeLines - i);
            }

            System.out.println("");
            stringBuilder.append("");
        }

        printNodeInternal(newNodes, level + 1, maxLevel);
        return stringBuilder.toString();
    }

    private static void printWhitespaces(StringBuilder stringBuilder, int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(" ");
            stringBuilder.append(" ");
        }
    }

    private static <T extends Comparable<?>> int maxLevel(TreeNode node) {
        if (node == null)
            return 0;

        return Math.max(BinaryTreePrinter.maxLevel(node.left), BinaryTreePrinter.maxLevel(node.right)) + 1;
    }

    private static <T> boolean isAllElementsNull(List<T> list) {
        for (Object object : list) {
            if (object != null)
                return false;
        }

        return true;
    }

}

