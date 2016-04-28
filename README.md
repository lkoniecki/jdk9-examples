# JDK 9 Examples
This repository contain examples of new JDK 9 features.

List of examples:
* [HttpClientExample](https://github.com/lkoniecki/jdk9-examples/blob/master/jdk9/src/jdk9/org/example/HttpClientExample.java):
new HttpClient API showcase using synchronous and asynchronous call,
* [HttpURLConnectionExample](https://github.com/lkoniecki/jdk9-examples/blob/master/jdk9/src/jdk9/org/example/HttpURLConnectionExample.java):
pre-JDK9 [HttpURLConnection](https://docs.oracle.com/javase/8/docs/api/java/net/HttpURLConnection.html) example,
* [ProcessInfo](https://github.com/lkoniecki/jdk9-examples/blob/master/jdk9/src/jdk9/org/example/ProcessInfo.java):
new Process API,
* [multiple-modules](https://github.com/lkoniecki/jdk9-examples/tree/master/multiple-modules): Project Jigsaw showcase.
Example how to create, compile and package multi-module project.

## How to create development environment?

1. Download and install [JDK9 Early Release](https://jdk9.java.net/download/).
2. Download and install [IntelliJ Idea](https://www.jetbrains.com/idea/). Version 2016.1.1 is required.
3. Clone [jdk9-examples](https://github.com/lkoniecki/jdk9-examples.git) as a new project.
4. In the `Project settings` add new SKD using newly installed JDK9

![SDK](https://github.com/lkoniecki/jdk9-examples/blob/images/sdks.png)
5. Set `Project SDK` to newly added JDK9 and `Project language level` to `9 - JDK modularization etc.`

![Project structure](https://github.com/lkoniecki/jdk9-examples/blob/images/project-settings.png)
6. Set `Project compiler output` to `out` directory

![Compiler output](https://github.com/lkoniecki/jdk9-examples/blob/images/project-output.png)
7. Add 3 new Java modules:
* jdk9 module. Set `Content Root` to `$PROJECT_DIR\jdk9\src\jdk9` directory.

![jdk9 module](https://github.com/lkoniecki/jdk9-examples/blob/images/jdk9-module.png)
* org.example.module.api module. Set `Content Root` to `$PROJECT_DIR\multiple-modules\org.example.module.api` directory.

![api module](https://github.com/lkoniecki/jdk9-examples/blob/images/api-module.png)
* org.example.module.impl module. Set `Content Root` to `$PROJECT_DIR\multiple-modules\org.example.module.impl` directory.

![impl module](https://github.com/lkoniecki/jdk9-examples/blob/images/impl-module.png)

8. Configure dependencies for `org.example.module.impl` module and add `org.example.module.api` dependency.

![impl module dependencies](https://github.com/lkoniecki/jdk9-examples/blob/images/impl-module-dep.png)

9. Set `Java Compiler` parameters

![Java Compiler parameters](https://github.com/lkoniecki/jdk9-examples/blob/images/java-compiler.png)
