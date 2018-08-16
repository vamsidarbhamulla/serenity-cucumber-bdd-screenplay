FROM maven:3.5.3-jdk-8

RUN mkdir -p /usr/repo/target
WORKDIR /usr/repo
COPY . /usr/repo

ENTRYPOINT ["mvn", "verify", "-Dwebdriver.remote.url=http://selenium_server_chrome:4444/wd/hub", "-Dwebdriver.remote.driver=chrome", "-Dchrome.switches=--headless"]