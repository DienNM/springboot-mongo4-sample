#!/bin/bash

mvn clean install

tag=$1
sudo docker build -t deenguyen/springboot-mongo4-sample:$tag .

sudo docker stop springboot-mongo4-sample && sudo docker rm app

sudo docker run -d --name springboot-mongo4-sample --net host -p 8080:8080 --init deenguyen/springboot-mongo4-sample:$tag 
