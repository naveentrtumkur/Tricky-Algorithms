//Approach #1: Using a hashset. Push the node when u encounter. If the node is present in the hashset return true. Else when we reach end i.e head == null return true.

//Approach #2: Using a two pointer approach.
Use slow and fast pointers. When fast == slow , return true.
Else when fast == null or fast.next == null return true.

