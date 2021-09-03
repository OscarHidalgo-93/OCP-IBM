
FROM nginx:alpine
#COPY index.html /usr/share/nginx/html/index.html

# Config Nginx para SPA
COPY nginx.conf /etc/nginx/conf.d/default.conf





RUN ["nginx","-g","daemon off"]