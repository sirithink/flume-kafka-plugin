import sbt._

class Plugins(info: ProjectInfo) extends PluginDefinition(info) {
  val twttrRepo = "twitter.com" at "http://maven.twttr.com"
  val defaultProject = "com.twitter" % "standard-project" % "0.12.7"
  val sbtIdeaRepo = "sbt-idea-repo" at "http://mpeltonen.github.com/maven/"
  val sbtIdea = "com.github.mpeltonen" % "sbt-idea-plugin" % "0.4.0"
}
