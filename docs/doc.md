# **Java Spring AWS S3 Plugin**

Java Spring AWS S3 Plugin is a set of technologies and development methodology that together help to use Amazon S3 as data storage in Java Spring Boot Applications.

This Plugin has support for projects created with Stack Java Spring Boot REST API. And given that it also supports Java Spring Boot projects that use **Maven** as a dependency manager and have their property settings in the **YAML** pattern.


In the next sections you will find detailed information on how to use Java Spring AWS S3 Plugin to enable the ability to use Amazon S3 as Storage in your projects.

Below is a summary of each section of this documentation.

1. [Plugin Core Technologies](#plugin-core-technologies)
2. [Capabilities Enabled when using the Plugin](#what-are-the-capabilities-enabled)
3. [Benefits of using the Plugin](#what-are-the-benefits-of-using-java-spring-aws-s3-plugin)
4. [Applying Java Spring AWS S3 Plugin](#applying-java-spring-aws-s3-plugin)


## **Plugin core technologies**

The purpose of this session is to inform which technologies are part of the Java Spring AWS S3 Plugin.

By applying this plugin in a Java Spring Boot project, your application will be able to benefit from the entire Amazon S3 infrastructure to manage objects in a fully distributed Storage.


### **Technological Composition**

The definition of this Plugin was thought of aiming at the greatest pains in the use of Amazon S3 as data storage in Java applications.

We understand that quality is non-negotiable, and we look to technologies and methodologies as a means to obtain the much-desired software quality. This premise was the guide for choosing each technology detailed below.


- Production environment
    - Spring Cloud AWS Core
    - Spring Clud AWS Autoconfigure
    - Amazon SDK S3
- Test environment
    - JUnit
    - Test Containers
- Development environment
    - Docker Compose
        - LocalStack Container


## **What are the capabilities Enabled**

By applying the Java Spring AWS S3 Plugin to your Java Spring Boot project, your project will be able to:

1. Using Amazon S3 as distributed storage
2. Create an automated integration test suite with TestContainers
3. Create Integrated Tests in order to validate if the operations with S3 have the expected behavior
4. Design and build software components that use Amazon S3 without connecting to AWS.
5. Development environment set up next to Docker with Docker-compose.



## **What are the benefits of using Java Spring AWS S3 Plugin**

1. Ease of configuring and using Amazon S3 in your project through the StackSpot CLI.
2. Sample codes on how to build storage on Amazon S3 using a bucket based on good practices.
6. Sample code for a Storage use case based on good practices.
7. Integration Tests example codes to validate Storage behavior.
8. Integration Tests sample codes to validate Storage use case behavior.
7. Configuration of the test environment with JUnit and Test Containers.
8. DockerCompose for using Amazon S3 with LocalStack in a development environment.
9. LOGS enabled to facilitate troubleshooting

[Watch this video to see the benefits of using Java Spring AWS S3 Plugin in your project](https://youtu.be/mIp44nnWVpo)


## **Applying Java Spring AWS S3 Plugin**

To apply the Java Spring AWS S3 Plugin in your projects and enjoy its benefits, you must have the StackSpot CLI installed on your machine. [If not, follow this tutorial to install](https://docs.stackspot.com/docs/stk-cli/installation/).

### 1. Import the Stack on your machine

```sh
stk import stack https://github.com/zup-academy/java-springboot-restapi-stack
```

### 2. Now check if the Stack was successfully imported

```sh
stk list stack | grep java-springboot
```

### 3. Apply the Plugin, in your project directory, execute

```sh
stk apply plugin java-springboot-restapi-stack/java-spring-aws-s3-plugin
```

### 4. Check the changes in your project

```sh
git status
```



## Support

If you need help, please open an [issue in Stack's Github repository](https://github.com/zup-academy/java-spring-aws-s3-plugin/issues).