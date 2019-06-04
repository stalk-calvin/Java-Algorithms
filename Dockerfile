FROM java:8 AS base

RUN rm /etc/apt/sources.list && rm /etc/apt/sources.list.d/jessie-backports.list
COPY sources.list /etc/apt/sources.list

RUN apt-key adv --keyserver hkp://keyserver.ubuntu.com:80 --recv 40976EAF437D05B5 && \
    apt-get -o Acquire::Check-Valid-Until=false update && \
    apt-get install -y maven

WORKDIR /java-algorithms

RUN git config --global core.autocrlf false && \
	git config --global core.safecrlf false && \
	git config --global core.eol = lf && \
	git config --global core.editor = vim

FROM base AS test

COPY . /java-algorithms

ENTRYPOINT ["mvn","clean","test", "jacoco:report", "coveralls:report"]
