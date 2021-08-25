# Archivo README para el entorno de Postgres

- Desplegamos el servicio mediante un docker-compose
- Consta de dos servicios, el de base de datos PostgreSQL y el adminer.
- Se expone el puerto 8000.
- Se crea un usuario y una contraseña de prueba, por lo que no será necesario ni crear volumenes ni apartarlos de la construccion de la imagen mediante un archivo privado de variables de entorno.