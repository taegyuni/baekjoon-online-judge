#include <stdio.h>
#include <math.h>
#define _CRT_SECURE_NO_WARNINGS

int main() {
    int testCase;
    int x1, y1;
    int x2, y2;
    int r1, r2; 
    int count[500] = {0};

    scanf("%d", &testCase);
    
    for (int i = 0;i < testCase;i++) {
        scanf("%d %d %d %d %d %d", &x1, &y1, &r1, &x2, &y2, &r2);

        double d = sqrt(pow((x2 - x1), 2) + pow((y2 - y1), 2));         //왜 도대체 더블만을 이용해야하는가...
        int rB, rS;

        if (r1 < r2) {
            rB = r2;
            rS = r1;
        }
        else {
            rB = r1;
            rS = r2;
        }

        if (x1 == x2 && y1 == y2) {
            if (rB != rS) {
                count[i] = 0;
            }
            else {
                count[i] = -1;
            }

        }
        else {
            if (d < rB + rS && rB < d + rS) {
                count[i] = 2;
            }
            else if (d == rS + rB || d + rS == rB) {
                count[i] = 1;
            }
            else if (d > rS + rB || d + rS < rB) {
                count[i] = 0;
            }
        }
    }

    for (int i = 0; i < testCase; i++) {
        printf("%d\n", count[i]);
    }
    return 0;
}