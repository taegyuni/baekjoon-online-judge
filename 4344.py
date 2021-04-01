C = int(input())


def averageF (N, *args):
    sumA = 0
    numCount = 0
    for i in args:
        sumA += i
    averageA = sumA / N
    for j in args:
        if j > averageA:
            numCount += 1
    percentageA = numCount / N * 100
    return percentageA


for i in range(0, C):
    N, *score = map(int, input().split())
    result = averageF(N, *score)
    result = float(result)
    print("%.3f%%" % result)
