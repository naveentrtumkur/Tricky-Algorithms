class Solution {
public:
    string addStrings(string num1, string num2) {
        string answ;
        int i=0,j=0;
        long int sum=0;
        int len1=num1.length(),len2=num2.length();
        long int n1=0,n2=0;
        j=len1 -1;
        for( int i=0;i<len1 && num1[i]!='\0';i++)
        {
            n1 += (num1[i]-'0')*(pow(10,j));
            //cout << j << n1 << endl;
            j--;
            //cout << num1[i] << pow(10,(0)) << n1 << endl;
            
        cout << n1 << endl;
        
        }
        cout << n1 << endl;
        j=len2 -1;
        for( int i=0;i<len2 && num2[i]!='\0';i++)
        {
            n2 += (num2[i]-'0')*(pow(10,(j)));
            j--;
           
        }
         cout << n2 << endl;
        sum=n1+n2;
        return to_string(sum);
    }
};
