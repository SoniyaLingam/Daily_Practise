
#include <stdio.h>
#include <string.h>

int main() {
    int n, count = 0;
    char s[1000];

    scanf("%d", &n);

    for (int i = 0; i < n; i++) {
        scanf("%999s", s);

        int h = 0;

        for (int j = 0; s[j] != '\0'; j++) {
            if (s[j] == 'H') {
                h++;
            }
        }

        if (h >= 2) {
            count++;
        }
    }

    printf("%d", count);

    return 0;
}
