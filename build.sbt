name := """scala-akka"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.7"

libraryDependencies ++= {
  val akkaVersion = "2.3.4"
  Seq(
    "com.typesafe.akka" %% "akka-actor" % akkaVersion,
    "com.typesafe.akka" %% "akka-slf4j" % akkaVersion,
    "com.typesafe.akka" %% "akka-testkit" % akkaVersion,
    jdbc,
    cache,
    ws,
    "org.jscience" % "jscience" % "4.3.1"
  )
}

libraryDependencies <+= scalaVersion("org.scala-lang" % "scala-compiler" % _ )
