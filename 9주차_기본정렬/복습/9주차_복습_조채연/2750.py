n = int(input())
arr= []
for _ in range(n):
    arr.append(int(input()))

arr = sorted(arr)
for i in range(n):
    print(arr[i])
