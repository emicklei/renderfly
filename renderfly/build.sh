mvn clean install dependency:copy-dependencies
cd target
    mkdir renderfly
    mkdir renderfly/bin
    mkdir renderfly/lib
    cp renderFly*.jar renderfly/lib
    cp dependency/* renderfly/lib
    cp ../src/main/scripts/* renderfly/bin