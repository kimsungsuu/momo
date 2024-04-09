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

| ![계좌개설1](https://github.com/kimsungsuu/momo/assets/90013342/cf8a168f-b00c-4b86-9714-ba661a6799ab) |![계좌개설3](https://github.com/kimsungsuu/momo/assets/90013342/41916794-43ff-4a76-aa79-65ba27d50d77)|![계좌개설4](https://github.com/kimsungsuu/momo/assets/90013342/58796f09-b402-4a34-bc11-06f58cec4441)|
| :------------------------------------: | :----------------------------------------: | :-------------------------------------------: |
|                계좌개설                 |                카드 추천 및 선택              |                  계좌 개설 확인              |

| ![모임1](https://github.com/kimsungsuu/momo/assets/90013342/7f3f6a05-9e35-4077-aa15-92b3a6b5f744) | ![송금1](https://github.com/kimsungsuu/momo/assets/90013342/d0c6caff-9506-457c-b55f-a87046fc04b1) | ![송금2](https://github.com/kimsungsuu/momo/assets/90013342/5767f33f-d51d-43b1-90da-2c92864990e7)|
| :---------------------------------------------------: | :-------------------------------------: | :-------------------------------------------: |
|                      모임 생성                    |                송금 계좌 입력               |                  송금 금액 설정               |

| ![송금3](https://github.com/kimsungsuu/momo/assets/90013342/39f44b70-18ab-4a97-8242-2be481323df4) | ![송금4](https://github.com/kimsungsuu/momo/assets/90013342/80c1113d-2e7b-4aa9-8ba0-57f385b80532) | ![피드1](https://github.com/kimsungsuu/momo/assets/90013342/4d83a775-83b3-432c-8c61-ad7056eac0db) |
| :-----------------------------------------------------: | :-----------------------------------------------: | :---------------------------------------: |
|                       비밀번호 확인                        |                     거래내역                     |         모임 피드 및 공지사항        |


---

## 🛠 기술 스택

### Frontend

<p>
	<img src="https://img.shields.io/badge/Nuxt.js-00DC82?style=flat-square&logo=Nuxt.js&logoColor=white">
  <img src="https://img.shields.io/badge/Javascript-3178C6?style=flat-square&logo=Javascript&logoColor=white">
  <img src="https://img.shields.io/badge/TailwindCSS-06B6D4?style=flat-square&logo=TailwindCSS&logoColor=white"/>
  <img src="https://img.shields.io/badge/shadcn%2Fui-000000?style=flat-square&logo=shadcnui&logoColor=white
  "/>
  <img src="https://img.shields.io/badge/node.js-339933?style=flat-square&logo=nodedotjs&logoColor=white">
  <img src="https://img.shields.io/badge/npm-2C8EBB?style=flat-square&logo=npm&logoColor=white">

</p>

### Backend

<p>
	<img src="https://img.shields.io/badge/Java-007396?style=flat-square&logo=OpenJDK&logoColor=white"/>
  <img src="https://img.shields.io/badge/Gradle-02303A?style=flat-square&logo=gradle&logoColor=white">
	<img src="https://img.shields.io/badge/Spring_Boot-6DB33F?style=flat-square&logo=springboot&logoColor=white"/>
	<img src="https://img.shields.io/badge/Spring_Security-6DB33F?style=flat-square&logo=springsecurity&logoColor=white"/>
<img src="https://img.shields.io/badge/Kubernetes-326CE5?style=flat-square&logo=Kubernetes&logoColor=white"/>
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
	<img src="https://img.shields.io/badge/Jenkins-D24939?style=flat-square&logo=jenkins&logoColor=white"/>
	<img src="https://img.shields.io/badge/Docker-2496ED?style=flat-square&logo=docker&logoColor=white"/>
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

- [Notion](https://www.notion.so/745b363783b64f90a9a63fc436e1bb34)

### 시스템 아키텍처
![image](https://github.com/kimsungsuu/momo/assets/90013342/aeef1adc-2434-48e1-b03e-97a8ee4d581a)
