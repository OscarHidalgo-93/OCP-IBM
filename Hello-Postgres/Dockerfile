#POSTGRES
FROM postgres:latest
WORKDIR /opt/hello-postgre
COPY ./ ./
#COPY postgers.config /opt/hello-postgre/
 

FROM adminer:latest
COPY ./ ./
EXPOSE 8000






RUN docker run -it -rm -p 8000:8080 --name postgres-test -e POSTRESS_PASSWORD=password