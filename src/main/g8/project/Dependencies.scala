import sbt._

object Versions {
	val akka      = "2.5.7"
	val cats      = "1.0.0-RC1"

}

object Dependencies {

  val akka = Seq(
    "com.typesafe.akka" %% "akka-actor"     % Versions.akka,
    "com.typesafe.akka" %% "akka-agent"     % Versions.akka,
    "com.typesafe.akka" %% "akka-stream"    % Versions.akka
  )

  val cats = Seq(
    "org.typelevel"         %% "cats"       % Versions.cats
  )

}
