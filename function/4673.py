a = []
b = []
for i in range(1, 10001):
    a.append(i)

for i in range(1, 10001):
    c = i + sum(map(int,str(i)))
    b.append(c)

b1 = set(b)
a1 = set(a)

a2 = sorted(a1 - b1)

for i in a2:
    print(i)

