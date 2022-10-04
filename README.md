# 스프링 프로젝트 생성 및 Gradle 외부 프로젝트 import
https://start.spring.io/ <br>
* 메이븐/그래들: 라이브러리 관리 툴
* 스냅샷: 아직 만들고 있는 버전 (예를 들어 1.0-snapshot 이라는 말의 의미는 1.0 버전을 바탕으로 개발중인 버전이라는 것을 의미 
`(m1 이라고 붙은 버전 역시 아직 정식 릴리즈된 버전은 아님)`
![image](https://user-images.githubusercontent.com/110083948/190884843-ee62ff4c-6090-49d4-b988-9001f374b4e6.png)
![image](https://user-images.githubusercontent.com/110083948/190884862-87361443-74a2-4d5b-8a58-af20a8209f9e.png)

* Add dependencies: 어떤 라이브러리를 가져와서 스프링 프로젝트를 만들것인가.
![image](https://user-images.githubusercontent.com/110083948/190884924-4affdea8-541c-4729-99ec-9f1b8b884206.png)

* thymeleaf: html을 만들어주는 템플릿 엔진 `이것말고도 종류가 다양하다`
![image](https://user-images.githubusercontent.com/110083948/190884995-e322d4c1-1550-4214-8d83-59e5e88940ba.png)
***GENERATE!!***

![image](https://user-images.githubusercontent.com/110083948/190887041-263b8d65-941f-488d-b3db-672be8d005c6.png) <br>
`gradle로 만든 외부 프로젝트 import하는 법. (일반적인 루트로 import를 시도하면 프로젝트가 보이지 않는다)`

* 프로젝트 import후, 생긴 물음표는 깃허브 PUSH를 한 후, 이클립스 재접속을 하면 사라져 있다

* 그래들 프로젝트 import 오류) **could not run phased build action using connection to gradle distribution** <br>
`그래들 버전이 맞지 않아서 발생하는 오류.` <br>
preferences - gradle로 가서 버전 확인 및 & 그래들 설치된 루트 아예 지정해주기 (루트: c:\Users\{username}\.gradle\wrapper\dists)
