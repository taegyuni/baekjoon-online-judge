a = input()
b = 0
for i in range(0, len(a)):
    j = 65
    c = 3
    while j <= 87 :
        if j == 80 or j == 87 :
            if a[i] >= chr(j) and a[i] <= chr(j + 3):
                b += c
            j += 4
            c += 1
        else:
            if a[i] >= chr(j) and a[i] <= chr(j + 2):
                b += c
            j += 3
            c += 1
print(b)