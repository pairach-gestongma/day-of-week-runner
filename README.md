# day-of-week-runner

```txt
วันเกิดเราจะเป็นวันในสัปดาห์ที่ตรงกับตอนเราเกิด จะมีอายุใดบ้าง
```

```ssh
# create project
mvn archetype:generate -DgroupId=person.pairach.calendar -DartifactId=pairach-calendar -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4 -DinteractiveMode=false

# pack
mvn install -DskipTests

# run
java -cp target/pairach-calendar-1.0-SNAPSHOT.jar person.pairach.calendar.App

```
