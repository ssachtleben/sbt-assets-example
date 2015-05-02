resolvers += "Typesafe repository" at "https://repo.typesafe.com/typesafe/maven-releases/"

resolvers += Resolver.url("ssachtleben sbt repository (snapshots)", url("http://ssachtleben.github.io/sbt-plugins/repository/snapshots/"))(Resolver.ivyStylePatterns)

addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.3.8")

addSbtPlugin("com.typesafe.sbt" % "sbt-coffeescript" % "1.0.0")

addSbtPlugin("com.typesafe.sbt" % "sbt-less" % "1.0.0")

addSbtPlugin("com.typesafe.sbt" % "sbt-jshint" % "1.0.1")

addSbtPlugin("com.typesafe.sbt" % "sbt-rjs" % "1.0.1")

addSbtPlugin("com.typesafe.sbt" % "sbt-digest" % "1.0.0")

addSbtPlugin("com.typesafe.sbt" % "sbt-mocha" % "1.0.0")

addSbtPlugin("com.ssachtleben" % "sbt-assets-filter" % "1.0.0-SNAPSHOT")

addSbtPlugin("com.ssachtleben" % "sbt-assets-handlebars" % "1.0.0-SNAPSHOT")

addSbtPlugin("com.ssachtleben" % "sbt-assets-define" % "1.0.0-SNAPSHOT")

addSbtPlugin("com.ssachtleben" % "sbt-assets-concat" % "1.0.0-SNAPSHOT")