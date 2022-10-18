a = input()
a = a.lower()   #모두 소문자로 만들기
c = 0           #큰값 비교
for i in range(97, 123):    #a~z까지 비교하기
    b = a.count(chr(i))     #각각 몇개씩 있는 지 b에 저장
    if b > c :              #센 값이 크면 그 문자의 아스키코드값을 d에 넣고 큰값은 b로 변경
        d = i
        c = b
    elif b == c :           #같다면 -1을 저장
        d = -1
if d == -1 :                #큰값의 개수가 같다면 ?를 출력
    print("?")
else :                      #소문자의 아스키코드값이므로 -32해줘서 대문자로 출력
    print(chr(d-32))