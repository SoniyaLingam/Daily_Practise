
#include <stdio.h>
#include <ctype.h>
#include <string.h>

int main() {
    char a[1000];

    scanf("%999s", a);

    for (int i = 0; a[i] != '\0'; i++) {
        if (strchr("aeiouAEIOU", a[i]) != NULL) {
            if (islower((unsigned char)a[i])) {
                a[i] = toupper((unsigned char)a[i]);
            } else {
                a[i] = tolower((unsigned char)a[i]);
            }
        }
    }

    printf("%s\n", a);

    return 0;
}
