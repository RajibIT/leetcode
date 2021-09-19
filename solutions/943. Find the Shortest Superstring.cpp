vector<vector<int> > dp,pre,par;
​
bool startWith(string s, string t)
{
// returns true if string s starts with string t
    int i;
    for(i=0; i<s.length()&&i<t.length(); i++)
    {
        if(s[i]==t[i])
            continue;
        else
            return false;
    }
    if(i==t.length())
        return true;
    else
        return false;
}
​
int calc(string A, string B)
{
 // calculate the number of extra characters required to be appended to A
 // if A is followed by B
 // for eg. calc("abcd","cdef") = 2
 
    int a=A.length(),b=B.length();
    for(int i=0; i<a; i++)
    {
        if(a-i<=b&&startWith(B,A.substr(i)))
        {
            return b-(a-i); 
        }
    }
    return b;
}
​
int finalMask,n;
​
int helper(int mask, int last)
