
## Logging
```
#Logging
quarkus.log.console.format=%-5p [%c{2.}] (%t) %s%e%n
quarkus.log.level=INFO
quarkus.log.category."com.redhat".level=DEBUG
```

## Frontend

```
quarkus.rest-client."com.redhat.developerscorner.knative.thoughts.frontend.ThoughtRESTClient".url=${THOUGHTS_API_URL} 
```

```Shell
export THOUGHTS_API_URL=http://localhost:8088
```

## Thoughts
