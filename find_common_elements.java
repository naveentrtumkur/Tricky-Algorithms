// Objective ois to find common elements, given two arrays with integer elements.

public int[] findCommonElement(int[] a, int[] b){
    List<Integer> array = new LinkedList<Integer>();
    HashSet<Integer> set = new HashSet<Integer>(); // Push the elements onto hashset
    for(int ele:a){
        set.add(ele);
    }

//Check if any element of B has element in Hashset. If so, That is a common element.
    for(int ele:b){
        if(set.contains(ele)){
            array.add(ele);
        }
    }

    int[] arr = new int[array.size()];
    for(int i = 0; i < array.size();i++){
        arr[i] = array.get(i);
    }
    return arr; // Return teh array with computed common elements.
}
