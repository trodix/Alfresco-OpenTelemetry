#!/bin/bash

cd demo && mvn -B clean package && \
cd ../ && docker compose -f community-docker-compose.yml up springboot -d --force-recreate --build