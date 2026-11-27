
#include <stdio.h>
#include <string.h>

int main() {
    char s[1000], t[1000];
    int map1[256] = {0};
    int map2[256] = {0};

    scanf("%999s %999s", s, t);

    if (strlen(s) != strlen(t)) {
        printf("Not Isomorphic");
        return 0;
    }

    for (int i = 0; s[i] != '\0'; i++) {
        unsigned char a = s[i];
        unsigned char b = t[i];

        if (map1[a] != 0 || map2[b] != 0) {
            if (map1[a] != b + 1 || map2[b] != a + 1) {
                printf("Not Isomorphic");
                return 0;
            }
        }
        else {
            map1[a] = b + 1;
            map2[b] = a + 1;
        }
    }

    printf("Isomorphic");

    return 0;
}
