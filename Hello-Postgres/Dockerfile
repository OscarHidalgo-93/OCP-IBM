#POSTGRES
FROM postgres:latest
WORKDIR /opt/hello-postgre
COPY ./ ./
#COPY postgers.config /opt/hello-postgre/
ENTRYPOINT [ "initdb" ]

 

FROM adminer:latest
COPY ./ ./
EXPOSE 8000





CMD [ "postgres" ]
