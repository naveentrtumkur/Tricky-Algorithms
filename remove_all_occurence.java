// Give an integer array and a key value, remove all teh occurence of that element in that array.

Public static int removeOccurances(int[] data, int key)
{
    if(data == null)
        return 0;
    in length = data.length-1; // Total length of the array.
    if( length < 0)
	return 0; 
    for(int i=length;i>=0;i--)
    {
	if(data[i] == key)
	{
	    data[i] = data[length];
 	    data[length--] = 0;
	    // Replace the ocuurnece with last element and change last element value to zero.
}
}
return length; //The length of the array after modification.
}
