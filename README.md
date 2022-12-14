## Java Spring AWS S3 Plugin

The **java-spring-aws-s3-plugin** is a plugin to enable and configure Spring Cloud AWS S3 in Spring Boot Java application.

Applying this plugin into a Spring Boot project will prepare and configure it for all those features:

1. Enables and configures Spring Cloud AWS Core for using S3;
2. Configures application to run Spring Boot integration tests using TestContainers with Localstack so that you can write good tests to validate properly your storage layer and any code that integrates with S3
3. Configures Docker Compose with Localstack so that you can run your application locally;
4. Generates production and test sample code so that you have a starting point for writing good production integration tests for S3 for features common as persisting,  searching e deleting;


As you can see, the beauty of this plugin is that **you DO NOT need an AWS account to write and run your application locally or even to run your integration tests** 🥳🥳


## How to use

The following steps show how to apply the plugin to an existing Java Spring Boot application.

1. First, import our stack if you haven't done it yet:
```sh
stk import stack https://github.com/zup-academy/java-springboot-restapi-stack
```

2. Now, in the project directory, apply the plugin and answer all the questions:
```sh
stk apply plugin java-springboot-restapi-stack/java-spring-aws-s3-plugin
```

3. Still inside the project directory, you can verify whether the plugin was applied or not by checking the updated and created files:
```sh
git status
```

Nice! You're ready for production I guess 🥳

[See here the benefits and how you can get the most out of the Java Spring AWS S3 Plugin](https://youtu.be/mIp44nnWVpo)

## Support

If you need any help, please open an [issue on Plugin's Github repository](https://github.com/zup-academy/java-spring-aws-s3-plugin). 