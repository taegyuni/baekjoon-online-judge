def underHundred(a):
    print(a)


def overHundred(b):
    if (b == 1000):
        b -= 1
    c = 99
    while b > 100:
        a1, a2, a3 = map(int, str(b))
        if (a1 - a2 == a2 - a3):
            c += 1
        b -= 1
    print(c)


a = int(input())
if (a < 100):
    underHundred(a)
if (a >= 100):
    overHundred(a)
