import Dependencies._

lazy val root = (project in file(".")).settings(
  inThisBuild(
    List(
      organization := "com.example",
      scalaVersion := "2.12.6",
      version := "0.1.0-SNAPSHOT"
    )),
  name := "$name$",
  libraryDependencies ++= {
    import Dependencies._
    core ++ logging ++ db ++ tests
  },
  scalacOptions += "-Ypartial-unification"
)
