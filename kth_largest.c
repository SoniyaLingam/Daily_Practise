
#include <stdio.h>

int main() {
    int n, k;

    scanf("%d", &n);

    int a[n];

    for (int i = 0; i < n; i++) {
        scanf("%d", &a[i]);
    }

    scanf("%d", &k);

    // Sort array in descending order
    for (int i = 0; i < n - 1; i++) {
        for (int j = i + 1; j < n; j++) {
            if (a[i] < a[j]) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
    }

    if (k >= 1 && k <= n) {
        printf("%d", a[k - 1]);
    } else {
        printf("-1");
    }

    return 0;
}
