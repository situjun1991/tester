;= @echo off
;= rem Call DOSKEY and use this file as the macrofile
;= %SystemRoot%\system32\doskey /listsize=1000 /macrofile=%0%
;= rem In batch mode, jump to the end of the file
;= goto:eof
;= Add aliases below here
e.=explorer .
ls=ls --all --show-control-chars -F --color $* 
pwd=cd
clear=cls
history=cat "%CMDER_ROOT%\config\.history"
unalias=alias /d $1
vi=vim $*
cmderr=cd /d "%CMDER_ROOT%"

npp=notepad++.exe $*
devices=adb devices -l

gco=git checkout $*
gs=git status
gb=git branch -a
gd=git branch -D $*
gca=git config --global --list
gl=git log --oneline --all --graph --decorate  $*
logall=git --no-pager log
gla=git --no-pager log --oneline --all --graph --decorate  $*

laijieqian=d: && cd ../../../ && cd SSLab && cd Android
qujieqian=d: && cd ../../../ && cd QULab && cd Android
github=d: && cd ../../../ && cd NoLaber
d:=d: && cd ../../../
desktop=c: && cd Desktop