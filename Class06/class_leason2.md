#### 패키지
- 패키지 -> 프로젝트의 하위폴더의 개념

##### 목적
1. 클래스 파일을 목적별로 묶어서 관리
2. 패키지마다 이름 공간 생성 -> 클래스 이름의 충돌 방지

#### 임포트
##### 사용방법1
- 임포트 -> 다른 패키지의 클래스를 사용하자고 할 때 사용
- 다른 패키지의 클래스 사용을 위해 클래스 이름의 전체 경로 이름 사용
- 다른 패키지에서 사용하려면 public 이어야 함

#### 외부 클래스 
##### 특징
- 클래스 외부에서 정의
- 동일한 파일에 작성된 클래스는 동일한 패키지내의 클래스로 간주
- 하나의 파일에는 최대 하나의 public class 만 존재 가능(파일 이름과 동일)

###### Tip
- 하나의 파일에 작성된 외부 클래스는 다른 패키지에서 사용 불가
- 다른 패키지에서 사용하고자 한다면 파일 분리