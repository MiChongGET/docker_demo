FROM hub.c.163.com/library/java:8-jre
# 指定当前操作目录
WORKDIR /work/project
#容器启动后执行的操作
CMD java -jar docker-demo.jar
