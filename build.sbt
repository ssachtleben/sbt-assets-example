name := """sbt-assets-example"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

libraryDependencies ++= Seq(
  "org.webjars" % "underscorejs" % "1.8.3"
)

pipelineStages in Assets := Seq(define,filter,concat)

includeFilter in filter := "*.coffee" || "*.less" || ".tmpl"

CoffeeScriptKeys.sourceMap := false

CoffeeScriptKeys.bare := true

Define.files := (resourceManaged in CoffeeScriptKeys.coffeescript in Assets).value / "javascripts" / "app" ** "*.js" +++
    (resourceManaged in HandlebarsKeys.handlebars in Assets).value ** "*.js"

Concat.srcDirs := Seq(
    (resourceManaged in CoffeeScriptKeys.coffeescript in Assets).value, 
    (resourceManaged in define in Assets).value)

Concat.groups := Seq(
  "javascripts/app.js" -> group(
    (resourceManaged in CoffeeScriptKeys.coffeescript in Assets).value / "javascripts" / "require" ** "*.js" +++
    (resourceManaged in define in Assets).value / "javascripts" / "app" ** "*.js" +++
    (resourceManaged in define in Assets).value / "template" / "app" ** "*.js" +++
    (resourceManaged in CoffeeScriptKeys.coffeescript in Assets).value / "javascripts" / "start" ** "*.js"
  )
)

fork in run := true