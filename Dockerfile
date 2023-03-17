FROM openjdk:11
COPY . /usr/src/myapp
WORKDIR /usr/src/myapp/src
RUN javac Main.java
CMD ["java", "Main"]


# Commands

# In Intellij terminal
# 1- docker build -t json-parser-task-v3 .
# 2-  docker run --name json-parser-app-v3 --rm -i json-parser-task-v3

# In Powershell
# 1- docker login
# 2- docker images and copy the name of image "json-parser-task-v3"
# 3-  docker tag json-parser-task-v3 marwannayman/json-parser-task-v3
# 4- docker push marwannayman/json-parser-task-v3


