# 내비바 등록
- layout 에 내비바 라인 기입 후 
- 공통탬플릿으로 분리 

# article 등록하기 완료
# article_form/Controller 게시글생성준비
- list_detail 에 버튼생성
- create 맵핑
- article form class 생성, 엔티티 설정
- service 에서 답변생성 내용 저장 설정
- create 포스트 맵핑
- form.html 구조변경/오류처리시 제목.내용남음

# layout 적용 및 article_list,detail 버튼작동
- gradle 의존성 주입
- 공통탬플릿 layout 부트스트링 추가
- html  layout 적용 및 구조수정

# article_detail/controller/service 생성 및 수정
- 컨트롤러 detail 맵핑, 서비스와 연결
- 서비스에서는 레포에서 이것이 있는지 증명
- detail.html 만들기

# service 생성 활용
- 서비스와 레포 연결
- 서비스에 getList 생성
- 서비스와 컨트롤러 연결

# article_list/Controller 수정
- 컨트롤러 와 레포 연결
- list.html 수정


# article,articleRepository 생성
- 엔티티 생성
- 인터페이스 레포 생성 jpa 연결

# root 연결
- html 만들기