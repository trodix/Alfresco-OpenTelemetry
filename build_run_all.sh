#!/bin/bash

cd demo && mvn -B clean package && \
cd ../ && docker compose -f community-docker-compose.yml up -d --build --force-recreate