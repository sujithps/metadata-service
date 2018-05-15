# Metadata Service 

## Reusable MicroServices Build using Spring Boot

Metadata service is similar to config service. It hold the metadata/config required across different services which needs to be stored in database and not in application properties along with code.


## Running Metadata service with Kubernetes
* start minikube `minikube start`  
* connect to minikube from the terminal ` eval $(minikube docker-env)`
* check for existing docker images `docker images`
* cd into the `metadata-service` project
* build the metadata docker image `docker build -f Dockerfile.build . -t metadata-service:1.0`
* check for existing docker images `docker images` , should see `metadata-service:1.0` in the list
* cd into the config directory `cd config`
* Create deployment and service for the metadata service app `kubectl create -f metadata-deployment.yaml`
* see the list of pods running ` kubectl get po -o wide`
* see the list of deployments `kubectl get deployments`
* see the list of services `kubectl get services`

`NAME               TYPE        CLUSTER-IP       EXTERNAL-IP   PORT(S)          AGE`

`kubernetes         ClusterIP   10.96.0.1        <none>        443/TCP          7m`

`metadata-service   NodePort    10.108.128.201   <none>        8080:31437/TCP   2m`

* copy the mapped port from the service list corresponding to the metadata service and hit 
  http://<<minikube-ip>>:<<port>> and see the result, here `http://192.168.99.100:31437`.




