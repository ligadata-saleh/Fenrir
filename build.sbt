


lazy val FenrirBase = project.in(file("FenrirBase"))

lazy val FenrirManager = project.in(file("FenrirManager")).dependsOn(FenrirBase)

lazy val Kafka_0_9 = project.in(file("FenrirSources/Kafka_0_9")).dependsOn(FenrirBase)

lazy val Camunda = project.in(file("FenrirDestinations/Camunda")).dependsOn(FenrirBase)