ThisBuild / version := "1.0"

ThisBuild / scalaVersion := "2.13.10"

lazy val root = (project in file("."))
  .settings(
    name := "VecMatLib"
  )

libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.15" % Test
