// Write a program to print the paths to a given node using CPP.

int search_path(node *root, int d)
{

if(root==null)
return 0;

if(root->data == d)
{
printf("%d",d);
return 1;// Returning 1 indicates that the value is found.
}

if(search_path(root->left))
{
printf("%d", root->left->data);
return 1;
}

if(search_path(root->right))
{
printf("%d",root->right->data);
return 1;
}
}

