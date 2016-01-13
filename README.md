SDK Thron Platform [![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.thron.sdk/thron-sdk-java/badge.svg)](http://search.maven.org/#search%7Cga%7C1%7Ccom.thron.sdk) [![Build Status](https://travis-ci.org/thron-com/thron-sdk-java.svg)](https://travis-ci.org/thron-com/thron-sdk-java)
==============

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

##Overview

The library is composed by different modules:

####[xadmin](https://developer.thron.com/#xadmin)

This component manages the content publication process, thanks to its interaction with xpackager and xcontents. Moreover, it provides a set of services for user roles and playlist management.

```xml
<dependencies>
    <dependency>
        <groupId>com.thron.sdk</groupId>
        <artifactId>thron-core-xadmin_2.11</artifactId>
        <version>5.0.4</version>
    </dependency>
</dependencies>
```

####[xcontents](https://developer.thron.com/#xcontents)

This component manages the content-related information: content metadata, comments, tags, content proprieties, ratings, visualizations and relations with other contents. It provides a set of web services to manage contents within folders, to moderate comments added by other users or to update content's description in different languages.

```xml
<dependencies>
    <dependency>
        <groupId>com.thron.sdk</groupId>
        <artifactId>thron-core-xcontents_2.11</artifactId>
        <version>5.0.4</version>
    </dependency>
</dependencies>
```

####[xintelligence](https://developer.thron.com/#xintelligence)

This component manages the content intelligence tools, allowing the user to define new classifications and tags and to link them to the entities.

```xml
<dependencies>
    <dependency>
        <groupId>com.thron.sdk</groupId>
        <artifactId>thron-core-xintelligence_2.11</artifactId>
        <version>5.0.4</version>
    </dependency>
</dependencies>
```

####[xpackager](https://developer.thron.com/#xpackager)

This is the component for managing user's working area (i.e., the area where contents are stored before publication) and content's packaging and transcoding process. Moreover, this component provides a set of services to manage contents preview before their publication over CDN.

```xml
<dependencies>
    <dependency>
        <groupId>com.thron.sdk</groupId>
        <artifactId>thron-core-xpackager_2.11</artifactId>
        <version>5.0.4</version>
    </dependency>
</dependencies>
```

####[xsso](https://developer.thron.com/#xsso)

This is the Single Sign-On component of the entire platform. It provides a set of interfaces for web services authentication and methods for user-defined configuration properties retrieving.

```xml
<dependencies>
    <dependency>
        <groupId>com.thron.sdk</groupId>
        <artifactId>thron-core-xsso_2.11</artifactId>
        <version>5.0.4</version>
    </dependency>
</dependencies>
```

####[xcontact](https://developer.thron.com/#xcontact)

This component allows you to handle the contacts received by the platform entities (users and contents), and allows you to connect the user to a contact and retrieve its deviceId.

```xml
<dependencies>
    <dependency>
        <groupId>com.thron.sdk</groupId>
        <artifactId>thron-core-xcontact_2.11</artifactId>
        <version>5.0.4</version>
    </dependency>
</dependencies>
```

####[xtest](https://developer.thron.com/#xtest)

This component allows you to easily check the connection to the platform and the integration best practices.

```xml
<dependencies>
    <dependency>
        <groupId>com.thron.sdk</groupId>
        <artifactId>thron-core-xtest_2.11</artifactId>
        <version>5.0.4</version>
    </dependency>
</dependencies>
```