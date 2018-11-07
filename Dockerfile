FROM java:8 AS base

RUN apt-get update && \
    apt-get install -y maven vim

WORKDIR /java-algorithms

RUN git config --global core.autocrlf false && \
	git config --global core.safecrlf false && \
	git config --global core.eol = lf && \
	git config --global core.editor = vim

FROM base AS test

COPY . /java-algorithms

ENTRYPOINT ["mvn","clean","test", "jacoco:report", "coveralls:report"]