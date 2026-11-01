
#include <stdio.h>
#include <string.h>
#include <stdlib.h>

int compare(const void *a, const void *b) {
    return (*(char *)b - *(char *)a);
}

int main() {
    char str[1000];

    scanf("%999s", str);

    int n = strlen(str);

    qsort(str, n, sizeof(char), compare);

    printf("%s\n", str);

    return 0;
}
