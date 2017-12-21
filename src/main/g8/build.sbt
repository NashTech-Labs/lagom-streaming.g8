organization in ThisBuild := "com.knoldus"

version in ThisBuild := "1.0-SNAPSHOT"

scalaVersion in ThisBuild := "2.11.8"

lazy val `streaming` = (project in file("."))
  .aggregate(`streaming-api`, `streaming-impl`)

lazy val `streaming-api` = (project in file("streaming-api"))
  .settings(common: _*)
  .settings(
    libraryDependencies += lagomJavadslApi
  )

lazy val `streaming-impl` = (project in file("streaming-impl"))
  .enablePlugins(LagomJava)
  .settings(common: _*)
  .dependsOn(`streaming-api`)

def common = Seq(
  javacOptions in compile += "-parameters"
)

