# RxJava playground

Demo project for playing around with `RxJava` and `Jooby`.

The current status is that, `RxJava3`'s `Single` is not inferred as non-blocking by `Jooby`.</br>
Bumping down to `RxJava2` resolves the issue.

```xml
<!-- pom.xml rxjava3 -->
<dependency>
  <groupId>io.reactivex.rxjava3</groupId>
  <artifactId>rxjava</artifactId>
  <version>3.0.8</version>
</dependency>

<!-- pom.xml rxjava2 -->
<dependency>
  <groupId>io.reactivex.rxjava2</groupId>
  <artifactId>rxjava</artifactId>
  <version>2.2.20</version>
</dependency>
```

```java
// App.java rxjava3
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Single;

// App.java rxjava2
import io.reactivex.Flowable;
import io.reactivex.Single;
```

Follow up: [2173](https://github.com/jooby-project/jooby/issues/2173)
[2018](https://github.com/jooby-project/jooby/pull/2018).
