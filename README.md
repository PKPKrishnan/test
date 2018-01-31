Template for Spring 4 MVC + JSP view + XML configuration, using Gradle build tool.

###1. Technologies used

Gradle 2.9 Spring 4.1.6.RELEASE

###2. To Run this project locally

$ gradle jettyRun

Access http://localhost:8080/test(specified path in build.gradle)


###3 Github upload and clone
git init

git config --global user.name ''
git config --global user.email '@gmail.com'
git config --global color.ui 'auto'

git remote add origin https://github.com/PKPKrishnan/test.git

git pull origin master

git add -A
git commit -m "comments"
git push


## build.gradle (project common)

apply plugin: 'java'
# Run Jetty
apply plugin: 'jetty'

repositories {
    mavenCentral()
}

dependencies {

    compile 'org.springframework:spring-webmvc:4.1.6.RELEASE'
    compile 'javax.servlet:servlet-api:3.0-alpha-1'

    testCompile group: 'junit', name: 'junit', version: '4.11'
}

# Run Jetty
// Embeded Jetty for testing
jettyRun{
    contextPath = "test"
    httpPort = 8080
}
# command
$ gradle or ./gradlew jettyRun


## dependencies.gradle (Add if need)
apply from: 'dependencies.gradle'

compile libraries.spring_webmvc

project.ext.libraries = [ spring_webmvc 'org.springframework:spring-webmvc:4.1.6.RELEASE']
