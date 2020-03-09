这个是用来做压测的  
使用的三方组件：    
* Springboot2.2.5.RELEASE  
* Tomcat9，或者可以去官网下载http://mirrors.tuna.tsinghua.edu.cn/apache/tomcat/tomcat-9/v9.0.31/bin/apache-tomcat-9.0.31.zip，其配置文件在files/tomcat
* Jmeter，用来通过接口压测，50个并发1s内启动，无参请求，文件在files/jmeter

启动方式：
* 可以通过main方法启动
* 可以通过外置的tomcat启动，无需修改配置

