## Spring Boot

- `spring-boot-starter-parent` 是一个特殊 Starter，它提供了有用的 **Maven 默认配置**。此外它还提供了**依赖管理功能**，使得我们可以忽略这些依赖的版本（version）标签；
  1. Java1.8作为默认编译器级别；
  2. 源代码使用UTF-8编码；
  3. 合理的资源过滤和插件配置；
  4. 依赖管理部分继承自 `spring-boot-dependencies` 的 POM，允许忽略常见依赖的 `<version>` 标签；
- `mvn dependency:tree` 命令以树的形式打印项目的依赖，`spring-boot-starter-parent` 本身不提供依赖；
- `@RestController` 注解告知Spring渲染结果字符串直接返回给调用者； `@RequestMapping` 注解提供路由信息，它告诉Spring路径与具体方法的映射关系；
- `@EnableAutoConfiguration` 注解告知Spring Boot根据添加的jar依赖来自动配置Spring；
  > **Auto-configuration** 被设计与 Starter 配合使用，但这两个概念并不是直接相关的。您可以自由选择 starter 之外的 jar 依赖，Spring Boot 仍然会自动配置您的应用程序；
- `mvn spring-boot:run` 可以使用该命令启动应用；
- Java不提供任何标准方式加载嵌套的jar文件，Spring Boot采用不同的方式，可以对jar进行嵌套；
- `spring-boot-maven-plugin` 该依赖可以帮我们创建可以执行 jar，添加相关依赖后，执行`mvn package`， `target` 目录中 xxx.jar 就是 Spring Boot 打包好的嵌套的 jar 文件，可以直接执行(完全自包含)；
- 使用 `jar tvf` 命令查看 jar 里面的内容；
- `target` 中的xxx.jar.origin 即为 Maven 所创建的原始 jar 文件；
  > Spring Boot 的每一次发行都会基于一个 Spring Framework 版本，因此我们**强烈**建议您不要指定指定它的版本。
- 