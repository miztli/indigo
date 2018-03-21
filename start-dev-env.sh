#! /bin/sh

KAFKA_DIR=/home/miztli/kafka_2.11-1.0.1

PROJECT_ROOT=/home/miztli/Workspace/indigo/khor

ENDPOINT=$PROJECT_ROOT/hum1703-endpoint
MS_ADMIN=$PROJECT_ROOT/hum1703-administracion
MS_INVENTARIO=$PROJECT_ROOT/hum1703-inventario
MS_NOTIFICACIONES=$PROJECT_ROOT/hum1703-notificaciones
MS_PREFERENCIAS=$PROJECT_ROOT/hum1703-preferencias
MS_PSICOMETRIA=$PROJECT_ROOT/hum1703-psicometria
TOPIC_MONITOR=$PROJECT_ROOT/hum1703-topicmonitor
WEB_APP=$PROJECT_ROOT/hum1703-web

## start postgres container
echo 'starting docker container postgres-container...'
docker container start postgres-container

## start mongod container

gnome-terminal \
--tab --working-directory=$KAFKA_DIR -e "bash -c 'cd bin;./zookeeper-server-start.sh ../config/zookeeper.properties;bash'" \
--tab --working-directory=$KAFKA_DIR -e "bash -c 'cd bin;./kafka-server-start.sh ../config/server.properties;bash'" \
--tab --working-directory=$TOPIC_MONITOR -e "bash -c 'git pull origin master;npm install;node index.js;bash'" \
--tab --working-directory=$ENDPOINT -e "bash -c 'git pull origin development;npm install;npm run dev;bash'" \
--tab --working-directory=$MS_ADMIN -e "bash -c 'git pull origin development;gradle bootRun;bash'" \
--tab --working-directory=$MS_INVENTARIO -e "bash -c 'git pull origin development;gradle bootRun;bash'" \
--tab --working-directory=$MS_NOTIFICACIONES -e "bash -c 'git pull origin development;npm install;npm run dev;bash'" \
--tab --working-directory=$MS_PSICOMETRIA -e "bash -c 'git pull origin development;npm install;npm run dev;bash'" \
--tab --working-directory=$MS_PREFERENCIAS -e "bash -c 'git pull origin development;gradle bootRun;bash'" \
--tab --working-directory=$WEB_APP -e "bash -c 'git pull origin development;npm instal;npm start;bash'" \
