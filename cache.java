LRU Cache – Dynamic Size

The program must accept N integers representing the N page requests and the size S of an LRU (Least Recently Used) cache as the input.
After R requests, the size of the LRU cache is increased by X.
The values of R and X are also passed as the input.

The program must print the number of pages added to the cache when processing the N requests as the output.

Boundary Conditions

1 ≤ R < N ≤ 1000

1 ≤ Each integer value ≤ 1000

1 ≤ S, X ≤ 100

Input Format

The first line contains N.

The second line contains N integer values separated by a space.

The third line contains S, R, and X separated by a space.

Output Format

The first line contains the number of pages added to the cache when processing the N requests.

Example Input/Output 1
Input
12
1 2 1 3 1 4 5 1 2 6 3 2
3 4 2

Output
7

Explanation

Here, N = 12, S = 3, R = 4, and X = 2.

Initially, the cache is empty.

Page 1 is requested → added to cache

Page 2 is requested → added to cache

Page 1 is requested again → already in cache

Page 3 is requested → added to cache

Now 4 requests have been processed, so the cache size increases by 2.

Processing continues using LRU replacement, and finally 7 pages are added to the cache while handling all 12 requests.

Example Input/Output 2
Input
15
7 8 10 8 7 6 6 4 2 1 1 10 9 3 4
5 10 1

Output
10

import java.util.*;

public class Cache {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] pages = new int[n];
        for (int i = 0; i < n; i++) {
            pages[i] = sc.nextInt();
        }

        int s = sc.nextInt();
        int r = sc.nextInt();
        int x = sc.nextInt();

        List<Integer> cache = new ArrayList<>();
        int count = 0;

        for (int i = 0; i < n; i++) {

            if (i > 0 && i % r == 0) {
                s += x;
            }

            int page = pages[i];

            if (cache.contains(page)) {
                cache.remove((Integer) page);
            } else {
                count++;
                if (cache.size() == s) {
                    cache.remove(cache.size() - 1);
                }
            }

            cache.add(0, page);
        }

        System.out.print(count);
    }
}

- Time complexity: O(n * s) in the worst case.
- Space complexity: O(n + s).