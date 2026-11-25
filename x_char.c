
#include <stdio.h>
#include <string.h>

int main() {
    char a[1000];
    int b;

    scanf("%999s", a);
    scanf("%d", &b);

    int n = strlen(a);

    for (int c = 0; c < n; c += b) {
        for (int j = c; j < c + b && j < n; j++) {
            printf("%c", a[j]);
        }
        printf("\n");
    }

    return 0;
}
