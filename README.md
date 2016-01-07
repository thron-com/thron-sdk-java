#SDK Thron Platform

This open-source library allows you to integrate Thron into your project

Learn more about the provided samples, documentation, integrating the SDK into your project, and more at https://support.thron.com

##Getting Started

####Maven
Add the following dependency to your pom.xml
```xml
<dependencies>
    <dependency>
        <groupId>com.thron.sdk</groupId>
        <artifactId>thron-core-xpublisher_2.11</artifactId>
        <version>5.0.4</version>
    </dependency>
</dependencies>
```

####Sbt
Add the following dependency to your build.sbt
```scala
libraryDependencies ++= Seq(
    "com.sun.jersey"    % "jersey-bundle"                 % "1.10",
    "com.thron.sdk"     % "thron-core-xpublisher_2.11"    % "5.0.4"
)
```

###Snapshot

For version under development you need to add `nexus snapshot repository`:

####Maven
Add the following dependency to your pom.xml
```xml
<repositories>
    <repository>
        <id>snapshot</id>
        <url>https://oss.sonatype.org/content/repositories/snapshots</url>
    </repository>
</repositories>

<dependencies>
    <dependency>
        <groupId>com.thron.sdk</groupId>
        <artifactId>thron-core-xpublisher_2.11</artifactId>
        <version>5.0.5-SNAPSHOT</version>
    </dependency>
</dependencies>
```

####Sbt
Add the following dependency to your build.sbt
```scala
resolvers += "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"

libraryDependencies ++= Seq(
    "com.sun.jersey"    % "jersey-bundle"                 % "1.10",
    "com.thron.sdk"     % "thron-core-xpublisher_2.11"    % "5.0.5-SNAPSHOT"
)
```