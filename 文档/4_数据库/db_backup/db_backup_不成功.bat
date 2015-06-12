net stop mysql
set /a t1=(1%time:~0,2%-100)*1
if %t1% LSS 10 set t1=0%t1%
set ymd_hms=%date:~0,4%%date:~5,2%%date:~8,2%%t1%%time:~3,2%%time:~6,2%

xcopy D:\mysql\data\ibdata1 E:\bd_backup\tushu\%ymd_hms%\ /y
xcopy D:\mysql\data\tushu\*.* E:\bd_backup\tushu\%ymd_hms%\ /y

net start mysql