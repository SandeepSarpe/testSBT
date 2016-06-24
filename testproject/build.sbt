name := """test"""

version := "1.0"+"-SNAPSHOT"

scalaVersion := "2.11.7"

libraryDependencies += "org.scalatest" %% "scalatest" % "1.9.1" % "test"


val releaseUrl = "releases" at s"http://172.25.30.71:8081/releases"

val snapshotUrl = "snapshots" at s"http://172.25.30.71:8081/snapshots"

publishTo := {
  if (isSnapshot.value) Some(snapshotUrl) else Some(releaseUrl)
}