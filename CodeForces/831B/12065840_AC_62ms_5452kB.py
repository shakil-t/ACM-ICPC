import sys

l1 = list(input())
l2 = list(input())
s = list(input())
n = len(s)
for i in range(n):
    temp = s[i].lower()
    try:
        index =l1.index(temp) 
        x = l2[index]
        if s[i].isupper():
            s[i] = x.upper()
        else:
            s[i] = x
    except:
        continue

print("".join(s))
     