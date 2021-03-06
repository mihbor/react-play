// Comment to get more information during initialization
logLevel := Level.Debug

// The Typesafe repository
resolvers += "Typesafe repository" at "https://repo.typesafe.com/typesafe/releases/"

// Use the Play sbt plugin for Play projects

addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.6.1")

// transform JSX assets
addSbtPlugin("com.github.ddispaltro" % "sbt-reactjs" % "0.6.8")

dependencyOverrides += "org.webjars.npm" % "minimatch" % "3.0.4"
