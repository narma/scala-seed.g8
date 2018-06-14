import sbt._

object Versions {
	val cats      = "1.1.0"
  val Slf4j     = "1.7.19"
  val Logback   = "1.2.3"
  val doobie    = "0.5.3"
  val flyway = "4.2.0"
  val circe = "0.10.0-M1"
}

object Dependencies {

  val logging = Seq(
    "com.typesafe.scala-logging" %% "scala-logging" % "3.9.0"
    "org.slf4j" % "slf4j-api" % Versions.Slf4j,
    "ch.qos.logback" % "logback-classic" % Versions.Logback,
  )

  val circe = Seq(
    "io.circe" %% "circe-core" % Versions.circe,
    "io.circe" %% "circe-generic-extras" % Versions.circe,
    "io.circe" %% "circe-parser" % Versions.circe,
    "io.circe" %% "circe-java8" % Versions.circe
  )

  val core = Seq(
    "org.typelevel"         %% "cats"       % Versions.cats
    "org.typelevel"         %% "cats-free"  % Versions.cats
  ) ++ circe

  val doobie = Seq(
     "org.tpolecat" %% "doobie-core"      % Versions.doobie,

  // And add any of these as needed
  // "org.tpolecat" %% "doobie-h2"        % Versions.doobie, // H2 driver 1.4.197 + type mappings.
  "org.tpolecat" %% "doobie-hikari"    % Versions.doobie, // HikariCP transactor.
  "org.tpolecat" %% "doobie-postgres"  % Versions.doobie, // Postgres driver 42.2.2 + type mappings.
  // "org.tpolecat" %% "doobie-specs2"    % Versions.doobie, // Specs2 support for typechecking statements.
  "org.tpolecat" %% "doobie-scalatest" % Versions.doobie  // ScalaTest support for typechecking statements.
  )

  val db = Seq(
     "org.flywaydb" % "flyway-core" % Version.flyway,
  ) ++ doobie

  lazy val tests = Seq(
    "org.scalatest" %% "scalatest" % "3.0.5"
  )
}
