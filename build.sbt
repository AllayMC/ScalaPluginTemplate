val scala3Version = "3.5.0"

val Compilonly = config("Compilonly") hide

lazy val root = project
  .in(file("."))
  .settings(

    resolvers +=
      "opencollab-repository-maven-snapshots"
        at "https://repo.opencollab.dev/maven-snapshots",
    resolvers +=
      "opencollab-repository-maven-releases"
        at "https://repo.opencollab.dev/maven-releases",
    resolvers +=
      "storehouse" at "https://storehouse.okaeri.eu/repository/maven-public/",
    resolvers +=
      "jitpack" at "https://www.jitpack.io/",
    
    ivyConfigurations += Compilonly,

    name := "Scala-Plugin-For-Allay",
    version := "0.1.0-SNAPSHOT",
    scalaVersion := scala3Version,
    
    libraryDependencies += "org.allaymc.allay" % "Allay-API" % "master-SNAPSHOT" % Compilonly,
    libraryDependencies += "org.slf4j" % "slf4j-api" % "1.7.32" % Compilonly,

    Compile / unmanagedClasspath ++= 
      update.value.select(configurationFilter("Compilonly"))
  )
