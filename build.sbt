name := "yojik"

organization := "thomasylee"

version := "0.1"

scalaVersion := "2.11.8"

scalacOptions ++= Seq(
  "-deprecation",
  "-encoding", "utf8",
  "-unchecked"
)

resolvers += "Typesafe Repository" at "https://repo.typesafe.com/typesafe/releases/"

libraryDependencies ++= {
  val akkaV = "2.5.11"

  Seq(
    "com.typesafe.akka" %% "akka-actor" % akkaV,
    "com.typesafe.akka" %% "akka-testkit" % akkaV
  )
}

mainClass in (Compile, run) := Some("im.yojik.Main")
