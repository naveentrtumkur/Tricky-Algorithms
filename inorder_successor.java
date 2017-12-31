//inorder successor solution.

public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
    while (root != null && root.val <= p.val)
        root = root.right;
    if (root == null)
        return null;
    TreeNode left = inorderSuccessor(root.left, p);
    return (left != null && left.val > p.val) ? left : root;
}
