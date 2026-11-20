
#include <stdio.h>
#include <string.h>
#include <stdlib.h>

int main() {
    int n, count = 0;
    char a[100][100], b[100];

    scanf("%d", &n);

    for (int i = 0; i < n; i++) {
        scanf("%99s", a[i]);
    }

    scanf("%99s", b);

    for (int i = 0; i < n; i++) {
        if (strcmp(a[i], b) == 0) {
            count++;
        }
    }

    if (count == atoi(b)) {
        printf("YES");
    } else {
        printf("NO");
    }

    return 0;
}
