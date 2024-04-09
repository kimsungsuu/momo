# 모모 - 모두의 모이는 뱅킹

> 삼성 청년 소프트웨어 아카데미(SSAFY) 10기 2학기 금융 특화 프로젝트 (A505)

![image](https://github.com/kimsungsuu/momo/assets/90013342/b9559342-f30c-4d53-beec-ba9bca1b7e37)

## ✨ 프로젝트 개요

🏷 **프로젝트 이름: 모모(모두가 모이는 모임)**

🗓️ **프로젝트 기간: 2024.02.19 ~ 2024.04.04 (6주)**

👥 **구성원: 👑이효리, 김성수, 엄세현, 명소이, 곽민우, 손준성**

---

## 🌃 기획 의도

> '모임 금융 관리를 전문적으로 지원하는 서비스가 너무 제한적이다'
> 
> '모임의 특성을 고려한 맞춤형 금융 관리 기능을 제공하는 플랫폼이 필요해보인다'
>
> '원하는 금융상품을 접목한 모임 뱅킹 서비스가 있었으면 좋겠는데?'


여러 뱅킹 플랫폼이 모임 통장 서비스를 제공하고 있지만, 대부분은 자사 계좌와의 연동에 한정되어 있습니다. 

이에 반해, 우리는 모임의 특성에 가장 적합한 혜택을 제공하는 카드를 추천하고, 

자사 은행과 타사 은행 구분 없이 사용할 수 있는 모임 뱅킹 서비스를 제공하고자 합니다.

---

## 💎 서비스 소개

- 모바일 은행으로서 계좌를 조회하고 개설할 수 있습니다.
- 참여하고 있는 모임을 조회할 수 있습니다.
- 사용자가 입력한 정보와 기존 거래 내역을 바탕으로 내 모임에서 가장 큰 혜택을 받을 수 있는 통장과 카드를 추천합니다.
- 모임 통장의 입출금 내역과 회비 납부 내역, 예산을 확인할 수 있습니다.
- 모임의 중요한 공지사항을 확인하고, 모임 사진을 피드로 언제나 볼 수 있습니다.
- '리포트' 모인 회비 현황, 소비 금액, 모임 참여도, 활동에 대한 선호도 등 다양한 정보를 포함하여, 모임의 금융 건강도를 점검하고 향후 활동 계획을 세우는 데 도움을 줍니다.
- 모임내에서 피드를 통해 모임원들과 소통할 수 있습니다.
- 모임내에서 예산을 생성하고 정기 납부, 내가 낸 예산 등의 예산 현황을 파악하는 등 예산 관리 서비스를 제공합니다.


---

## 🎯 서비스 대상

- 다양한 혜택을 받을 수 있는 모임 통장을 개설하고 싶은 구성원


---

## 👩‍💻 역할

### 김성수
- **Design**
   - 서비스 페이지 디자인(Figma)
- **Frontend**
   - 모임 도메인 페이지 전체 제작
   - 공지사항 도메인 페이지 전체 제작
   - 피드 도메인 페이지 전체 제작
   - 예산 도메인 페이지 전체 제작
   - 추가 메뉴 페이지 제작 
- **ETC**
   - 시연 시나리오 작성
--- 

## 🌈 서비스 화면 소개


|  | ![계좌개설1](https://github.com/kimsungsuu/momo/assets/90013342/cf8a168f-b00c-4b86-9714-ba661a6799ab)
 |
| :------------------------------------: | :----------------------------------------: | :-------------------------------------------: |
|                홈 화면                 |                대기방 생성                 |                   게임 시작                   |

| ![Enter Waitroom](./assets/screen/waitroom_enter.gif) | ![Enter Room](./assets/screen/room.gif) | ![Write Feed](./assets/screen/write_feed.gif) |
| :---------------------------------------------------: | :-------------------------------------: | :-------------------------------------------: |
|                      대기방 입장                      |                 방 입장                 |                   피드 작성                   |

| ![Predict Success](./assets/screen/predict_success.gif) | ![Enter Room](./assets/screen/predict_failed.gif) | ![Write Feed](./assets/screen/result.gif) |
| :-----------------------------------------------------: | :-----------------------------------------------: | :---------------------------------------: |
|                        예측 성공                        |                     예측 실패                     |         결과 확인 및 이미지 저장          |

---

## 🛠 기술 스택

### Frontend

<p>
	<img src="https://img.shields.io/badge/Nuxt.js-00DC82?style=flat-square&logo=Nuxt.js&logoColor=white">
  <img src="https://img.shields.io/badge/Typescript-3178C6?style=flat-square&logo=typescript&logoColor=white">
  <img src="https://img.shields.io/badge/TailwindCSS-06B6D4?style=flat-square&logo=TailwindCSS&logoColor=white"/>
  <img src="https://img.shields.io/badge/shadcn%2Fui-000000?style=flat-square&logo=shadcnui&logoColor=white
  "/>
  <img src="https://img.shields.io/badge/node.js-339933?style=flat-square&logo=nodedotjs&logoColor=white">
  <img src="https://img.shields.io/badge/PWA-5A0FC8?style=flat-square&logo=pwa&logoColor=white">
  <img src="https://img.shields.io/badge/yarn-2C8EBB?style=flat-square&logo=yarn&logoColor=white">
  <img src="https://img.shields.io/badge/dotenv-ECD53F?style=flat-square&logo=dotenv&logoColor=white">
  <img src="https://img.shields.io/badge/Firebase-FFCA28?style=flat-square&logo=firebase&logoColor=white">
  <img src="https://img.shields.io/badge/editorconfig-FEFEFE?style=flat-square&logo=editorconfig&logoColor=black">
</p>

### Backend

<p>
	<img src="https://img.shields.io/badge/Java-007396?style=flat-square&logo=OpenJDK&logoColor=white"/>
  <img src="https://img.shields.io/badge/Gradle-02303A?style=flat-square&logo=gradle&logoColor=white">
	<img src="https://img.shields.io/badge/Spring_Boot-6DB33F?style=flat-square&logo=springboot&logoColor=white"/>
	<img src="https://img.shields.io/badge/Spring_Security-6DB33F?style=flat-square&logo=springsecurity&logoColor=white"/>
  <img src="https://img.shields.io/badge/Firebase-FFCA28?style=flat-square&logo=firebase&logoColor=white">
  <img src="https://img.shields.io/badge/editorconfig-FEFEFE?style=flat-square&logo=editorconfig&logoColor=black">
</p>

### Database

<p>
  <img src="https://img.shields.io/badge/MariaDB-003545?style=flat-square&logo=mariadb&logoColor=white"/>
  <img src="https://img.shields.io/badge/Redis-DC382D?style=flat-square&logo=redis&logoColor=white"/>
</p>

### DevOps

<p>
  <img src="https://img.shields.io/badge/Ubuntu-E95420?style=flat-square&logo=ubuntu&logoColor=white">
  <img src="https://img.shields.io/badge/GitLab-FC6D26?style=flat-square&logo=gitlab&logoColor=white">
	<img src="https://img.shields.io/badge/AWS EC2-FF9900?style=flat-square&logo=amazonec2&logoColor=white"/>
	<img src="https://img.shields.io/badge/Jenkins-D24939?style=flat-square&logo=jenkins&logoColor=white"/>
	<img src="https://img.shields.io/badge/Docker-2496ED?style=flat-square&logo=docker&logoColor=white"/>
  <img src="https://img.shields.io/badge/Portainer-13BEF9?style=flat-square&logo=portainer&logoColor=white">
	<img src="https://img.shields.io/badge/NGINX-009639?style=flat-square&logo=nginx&logoColor=white"/>
  <img src="https://img.shields.io/badge/NGINX_Proxy_Manager-F15833?style=flat-square&logo=nginxproxymanager&logoColor=white">
</p>

### Communication

<p>
	<img src="https://img.shields.io/badge/figma-F24E1E?style=flat-square&logo=figma&logoColor=white">
	<img src="https://img.shields.io/badge/jira-0052CC?style=flat-square&logo=jira&logoColor=white">
	<img src="https://img.shields.io/badge/notion-000000?style=flat-square&logo=notion&logoColor=white">
	<img src="https://img.shields.io/badge/Mattermost-0058CC?style=flat-square&logo=mattermost&logoColor=white">
</p>

---

## 📝 프로젝트 산출물

- [Notion](https://ssafy-s10-a809.notion.site/Oomool-WIKI-e152fb257b3e45a1bbdb6fc3c569bbdd?pvs=4)

### 시스템 아키텍처

![System Architecture](./assets/system_architecture.png)

### E-R Diagram

![ERD](./assets/erd.png)
