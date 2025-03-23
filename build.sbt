ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.16"

lazy val root = (project in file("."))
  .settings(
    name := "demo-effects-in-scala",
    idePackagePrefix := Some("lv.id.jc")
  )
