package org.calvin.Tree;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.calvin.__Utils.AssortedMethods;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FindLargestElementInBSTTest {
    private FindLargestElementInBST fixture;

    @BeforeEach
    public void setUp() {
        fixture = new FindLargestElementInBST();
    }

    @Test
    public void shouldFindLargest() {
        int[] input = {1,2,3,6,7,8,9,10};
        TreeNode root = AssortedMethods.sortedArrayToBalancedBST(input, 0, input.length-1);

        assertEquals(10, fixture.largest(root));
    }

    @Test
    public void shouldFindSecondLargest() {
        int[] input = {1,2,3,6,7,8,9,10};
        TreeNode root = AssortedMethods.sortedArrayToBalancedBST(input, 0, input.length-1);

        assertEquals(9, fixture.secondLargest(root));
    }

    @Test
    public void shouldFindSecondLargestWithLastElementLeft() {
        int[] input = {1,2,3,6,7,8};
        TreeNode root = AssortedMethods.sortedArrayToBalancedBST(input, 0, input.length-1);

        // make node 8 null
        root.right.right = null;
        // make a new node left to 6
        root.right.left.left = new TreeNode(5);

        // Resulting Tree look like this.
        //       3
        //      / \
        //     /   \
        //    /     \
        //   /       \
        //  1        7
        //  \       /
        //   \     /
        //   2    6  <-- second largest
        //       /
        //      5

        assertEquals(6, fixture.secondLargest(root));
    }
}