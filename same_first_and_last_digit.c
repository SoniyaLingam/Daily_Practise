
#include <stdio.h>
#include <string.h>

int main() {
    int n, count = 0;
    char a[1000];

    scanf("%d", &n);

    for (int i = 0; i < n; i++) {
        scanf("%999s", a);

        int len = strlen(a);

        if (a[0] == a[len - 1]) {
            printf("%s ", a);
            count++;
        }
    }

    if (count == 0) {
        printf("-1");
    }

    return 0;
}
