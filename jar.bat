REM
cd bin
jar cf ..\jar\rrozhkov-lib.jar ru\rrozhkov\lib\collection\*.* ru\rrozhkov\lib\convert\*.* ru\rrozhkov\lib\data\*.* ru\rrozhkov\lib\db\*.* ru\rrozhkov\lib\filter\*.* ru\rrozhkov\lib\report\*.*
copy  ..\jar\rrozhkov-lib.jar ..\..\EasyKin\lib\
copy  ..\jar\rrozhkov-lib.jar ..\..\EasyKinWeb\src\main\webapp\WEB-INF\lib\