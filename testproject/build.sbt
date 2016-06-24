name := """test"""

version := "1.0"+"-SNAPSHOT"

scalaVersion := "2.11.7"

libraryDependencies += "org.scalatest" %% "scalatest" % "1.9.1" % "test"


lazy val nexus = "http://172.25.30.71:8081/"

val releaseUrl = "releases" at s"$nexus/releases"

val snapshotUrl = "snapshots" at s"$nexus/snapshots"

publishTo := {
  if (isSnapshot.value) Some(snapshotUrl) else Some(releaseUrl)
}