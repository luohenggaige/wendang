net stop mysql
set ymd=%date:~0,4%%date:~5,2%%date:~8,2%
set hms=%time:~1,2%%time:~3,2%%time:~6,2%

xcopy D:\mysql\data\tushu\*.* E:\bd_backup\tushu\%ymd%_%hms%\ /y

net start mysql