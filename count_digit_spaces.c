
#include <stdio.h>

int main() {
    char str[1000];
    int spaces = 0, digits = 0;

    fgets(str, sizeof(str), stdin);

    for (int i = 0; str[i] != '\0'; i++) {
        if (str[i] == ' ') {
            spaces++;
        }
        else if (str[i] >= '0' && str[i] <= '9') {
            digits++;
        }
    }

    printf("Spaces = %d\n", spaces);
    printf("Digits = %d\n", digits);

    return 0;
}
