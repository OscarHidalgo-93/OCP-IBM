#POSTGRES
FROM postgres:latest
WORKDIR /opt/hello-postgre
COPY ./ ./
#COPY postgers.config /opt/hello-postgre/
EXPOSE 8000
ENV POSTGRES_PASSWORD=password
VOLUME [ "/opt/hello-postgre" ]


 

FROM adminer:latest
COPY ./ ./
EXPOSE 8000






 
