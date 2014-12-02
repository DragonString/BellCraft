@echo off
@title Bell Easy Tool
@color B

echo Bell Easy Tool 개발자 : 방울(bell04204@gmail.com)
echo 개발자 사이트 : http://BellLife.tistory.com/
echo.
echo        [사용법(Usage)]
echo 포지 개발 환경 구축 : 'install' 입력
echo 빌드 : 'build' 입력

:COMMAND
@color B
SET /P input=명령어 입력 : 
IF %input%==install GOTO INSTALL
IF %input%==build GOTO BUILD
echo 잘못된 명령어 입니다.
echo.
GOTO COMMAND

:INSTALL
@color F
echo 포지 개발환경 자동 설치 시작
start gradlew setupDevWorkspace eclipse
echo.
GOTO COMMAND

:BUILD
@color F
echo 빌드 시작
start gradlew build
echo.
exit
GOTO COMMAND