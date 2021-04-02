n = int(input())

a = [input() for _ in range(n)]

for i in range(n):

    score = 0
    scoreCount = 0
    v = a[i]

    if v[0] == 'O':
        score += 1
        scoreCount += 1
    for j in range(1, len(a[i])):
        if v[j] == 'O':
            if v[j - 1] == 'O':
                scoreCount += 1
                score += scoreCount
            else:
                scoreCount = 1
                score += 1
        else:
            scoreCount = 0
    print(score)
