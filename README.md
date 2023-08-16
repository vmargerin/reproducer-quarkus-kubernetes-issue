Reproduce an issue on minikube extension for ingress generation on Quarkus 3.x

```
mvn quarkus:build
```

Missing ingress block in both kubernetes and minikube.yaml file

```
mvn quarkus:dev
```

Missing **http** ingress block in minikube.yaml file (but exist in kubernetes.yaml)