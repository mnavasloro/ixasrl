mvn install:install-file -Dfile=src/main/resources/srl-20130917/lib/liblinear-1.51-with-deps.jar -DgroupId=local -DartifactId=liblinear -Dversion=1.51 -Dpackaging=jar
mvn install:install-file -Dfile=src/main/resources/srl-20130917/srl.jar -DgroupId=local -DartifactId=srl -Dversion=1.0 -Dpackaging=jar
mvn install:install-file -Dfile=src/main/resources/srl-20130917/lib/seg.jar -DgroupId=local -DartifactId=seg -Dversion=1.0 -Dpackaging=jar