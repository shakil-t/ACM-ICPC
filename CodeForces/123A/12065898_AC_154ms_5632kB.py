from collections import Counter

d, t = 'NO', input()
c, n = Counter(t), len(t)
p = [0] * (n + 1)
for i in range(2, n // 2 + 1):
    if 1 - p[i]: p[i::i] = [1] * (n // i)
s = sum(p)
u = v = ''
for q, k in c.items():
    if v or k < s:
        u += q * k
    else:
        u += q * (k - s)
        v = q
if v:
    d, j = 'YES\n', 0
    for i in range(1, n + 1):
        if p[i]:
            d += v
        else:
            d += u[j]
            j += 1
print(d)