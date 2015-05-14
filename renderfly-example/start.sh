mvn dependency:copy-dependencies
cp target/*.jar ./target/dependency
java -classpath './target/dependency/*' org.renderfly.http.HttpServer ./src/main/resources/renderfly.properties