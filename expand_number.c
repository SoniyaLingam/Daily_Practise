
#include <stdio.h>

int main() {
    char a[1000];
    scanf("%999s", a);

    for (int i = 0; a[i] != '\0'; i++) {
        int n = a[i] - '0';

        for (int j = 0; j < n; j++) {
            printf("%c", a[i]);
        }
    }

    return 0;
}
