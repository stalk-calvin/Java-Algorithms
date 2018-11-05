FROM java:8 AS base
RUN apt-get update && \
    apt-get install -y maven

FROM base AS test
WORKDIR /java-algorithms
COPY . /java-algorithms
ENTRYPOINT ["mvn","clean","test", "jacoco:report", "coveralls:report"]