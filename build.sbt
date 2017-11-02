name := "Kamisado"

version := "0.1"

scalaVersion := "2.12.4"

// This is an application with a main method
scalaJSUseMainModuleInitializer := true

lazy val root = project.
  enablePlugins(ScalaJSPlugin)