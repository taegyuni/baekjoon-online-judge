def solve(a: list):
    return int(sum(a))

a = [int(ch) for ch in input().split()]
n = solve(a)
print(n)