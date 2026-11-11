
#include <stdio.h>

int main() {
    int n;
    scanf("%d", &n);

    double sum = 0.0;
    char a[100];

    for (int i = 0; i < n; i++) {
        scanf("%99s", a);

        int num = 0;
        for (int j = 0; a[j] != '\0'; j++) {
            num = num * 10 + (a[j] - '0');
        }

        int last = a[__builtin_strlen(a) - 1] - '0';

        if (last != 0) {
            sum += (double)num / last;
        } else {
            sum += (double)num / 10;
        }
    }

    printf("%.3f\n", sum);

    return 0;
}
