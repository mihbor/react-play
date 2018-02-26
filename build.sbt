name := "play-react"

version := "1.0-SNAPSHOT"

scalaVersion := "2.11.8"

concurrentRestrictions := Seq(Tags.limitAll(1))

lazy val root = (project in file("."))
  .enablePlugins(PlayScala)

libraryDependencies ++= Seq(
  "org.webjars" % "react" % "0.13.1",
  ehcache,
  guice
)