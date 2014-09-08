SpringMVC + Dubbo
===============

###### step 1:
F:\Workspaces\dubbo-demo>mvn clean compile package

###### step 2:
cd F:\Workspaces\dubbo-demo\dubbo-demo-api\target\

F:\Workspaces\dubbo-demo\dubbo-demo-api\target>mvn install:install-file -Dfile=dubbo-demo-api-1.0.0.jar -DgroupId=org.jeedevframework.dubbo -DartifactId=dubbo-demo-api -Dversion=1.0.0 -Dpackaging=jar

###### step 3:
cd F:\Workspaces\dubbo-demo\dubbo-demo-provider\target\provider\bin\

F:\Workspaces\dubbo-demo\dubbo-demo-provider\target\provider\bin>start.bat

(生成可执行文件也可使用如下命令：mvn package appassembler:assemble)

###### step 4:
cd F:\Workspaces\dubbo-demo\dubbo-demo-consumer\

F:\Workspaces\dubbo-demo\dubbo-demo-consumer>mvn jetty:run

###### step 5:
curl http://192.168.1.102:8080/sayHello?name=jack


## or

###### step1:
run dubbo-demo-provider/org.jeedevframework.dubbo.app.Provider.main 

###### step2:
run dubbo-demo-consumer/org.jeedevframework.dubbo.app.Consumer.main 


--------------
# monitor

download dubbo-admin-2.5.3.war and run on tomcat or jetty

(vi webapps/ROOT/WEB-INF/dubbo.properties)

many pictures in /document/screenshot/ **