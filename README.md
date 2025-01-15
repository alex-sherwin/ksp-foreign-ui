# install random jar into a local maven repo


```bash
# on windows
mvn org.apache.maven.plugins:maven-install-plugin:3.1.3:install-file -Dfile=".\lib\krpc-java-0.5.4.jar" -DgroupId="krpc" -DartifactId="krpc-java" -Dversion="0.5.4" -Dpackaging="jar" -DlocalRepositoryPath=".\repo"
```