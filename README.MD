single container:
  docker run --build-args JAR_FILE=<build artifact> -p 8080:8080 dolmengate/bb-app:<build version>

stack:
  docker swarm init
  docker stack deploy -c docker-compose.yml bigboy
