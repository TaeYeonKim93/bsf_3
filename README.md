# 

## Model
www.msaez.io/#/54400278/storming/bsf_4

## Before Running Services
### Make sure there is a Kafka server running
```
cd kafka
docker-compose up
```
- Check the Kafka messages:
```
cd infra
docker-compose exec -it kafka /bin/bash
cd /bin
./kafka-console-consumer --bootstrap-server localhost:9092 --topic
```

## Run the backend micro-services
See the README.md files inside the each microservices directory:

- aimodel
- map
- modeldata
- statistic
- summary
- dashboard


## Run API Gateway (Spring Gateway)
```
cd gateway
mvn spring-boot:run
```

## Test by API
- aimodel
```
 http :8088/aiModels id="id" modelId="modelId" modelName="modelName" status="status" modelPath="modelPath" modelVersion="modelVersion" isLastestVersion="isLastestVersion" trainCompTime="trainCompTime" performance="performance" 
```
- map
```
 http :8088/maps id="id" mapId="mapId" dataType="dataType" geoData="geoData" 
```
- modeldata
```
 http :8088/riskData id="id" dataId="dataId" dataType="dataType" size="size" createAt="createAt" dataValue="dataValue" analyzeResult="analyzeResult" 
 http :8088/srcData id="id" dataId="dataId" dataType="dataType" size="size" createAt="createAt" dataValue="dataValue" 
```
- statistic
```
 http :8088/statistics id="id" statisticId="statisticId" type="type" period="period" value="value" 
```
- summary
```
 http :8088/summaries id="id" summaryId="summaryId" dataType="dataType" content="content" 
```
- dashboard
```
```


## Run the frontend
```
cd frontend
npm i
npm run serve
```

## Test by UI
Open a browser to localhost:8088

## Required Utilities

- httpie (alternative for curl / POSTMAN) and network utils
```
sudo apt-get update
sudo apt-get install net-tools
sudo apt install iputils-ping
pip install httpie
```

- kubernetes utilities (kubectl)
```
curl -LO "https://dl.k8s.io/release/$(curl -L -s https://dl.k8s.io/release/stable.txt)/bin/linux/amd64/kubectl"
sudo install -o root -g root -m 0755 kubectl /usr/local/bin/kubectl
```

- aws cli (aws)
```
curl "https://awscli.amazonaws.com/awscli-exe-linux-x86_64.zip" -o "awscliv2.zip"
unzip awscliv2.zip
sudo ./aws/install
```

- eksctl 
```
curl --silent --location "https://github.com/weaveworks/eksctl/releases/latest/download/eksctl_$(uname -s)_amd64.tar.gz" | tar xz -C /tmp
sudo mv /tmp/eksctl /usr/local/bin
```

