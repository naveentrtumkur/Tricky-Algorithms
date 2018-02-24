int* removeNumberFromArray(int number, int array[])
{
    int count = 0;
    int size = (sizeof(array)/sizeof(array[0]));
    int j= size - 1;
    for (int i=0; i< (size - count); i++) {
        if(array[i] == number)
        {
            while(array[j] == number)
            {
                j--;
            }
            array[i] = array[j];
            array[j] = '\0';
            j--;
            count++;
        }
    }
    return array1;
}
