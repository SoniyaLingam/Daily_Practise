Fill Buckets with Water

There are N buckets arranged in a row. The amount of water in each bucket is passed as the input. All N buckets have the same capacity C, which is also passed as the input. A boy wants to fill as many buckets as possible based on the following conditions:

He chooses the leftmost incomplete bucket (i.e., the bucket with less water than capacity), and he fills the remaining incomplete buckets from left to right using the water in the chosen bucket.

Once the chosen bucket is empty, he removes that bucket from the row.

He then repeats the process of filling the buckets until all the buckets are stable.

Finally, the program must print the amount of water in the remaining buckets as the output.

Boundary Condition(s):
2 <= N <= 100
1 <= Amount of water in each bucket <= C <= 1000

Input Format:

The first line contains N.

The second line contains N integers separated by a space.

The third line contains C.

Output Format:

The first line contains the integer values representing the amount of water in the remaining buckets.

Example Input/Output 1:

Input:

5
5 8 3 7 9
10


Output:

10 2 10 10

n=int(input())
b=list(map(int,input().split()))
c=int(input())
while 1:
    i=next((x for x in range(len(b)) if b[x]<c),-1)
    if i==-1:break
    w=b[i];j=i+1
    while j<len(b)and w:
        if b[j]<c:
            r=c-b[j]
            if r<=w:b[j]=c;w-=r
            else:b[j]+=w;w=0
        j+=1
    if w==0:b.pop(i)
    else:b[i]=w;break
print(*b)


Time complexity: O(n^2) in the worst case.
Space complexity: O(n).