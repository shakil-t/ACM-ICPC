n=int(input())
l=input().split()
l=list(map(int, l))
b=True
for ele in l:
    if(ele==1):
        b=False
        break
if(b):
    print("EASY")
else:
    print("Hard")