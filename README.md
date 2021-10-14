# pokemon-api

This is a spring boot service that provides a simple Pokemon API.

## Available endpoints 

*URL*: https://pokemon-api-328912.ey.r.appspot.com/

 - GET: /pokemon
```json

  {
    "count":10,
    "result":[
      {
        "id":1,
        "name":"bulbasaur"
      }
      ...
    ]
  }
```
- GET /pokemon/{id}
```json
  {
    "id":1,
    "name":"bulbasaur"
  }
```

## Build & Deployment 

This service is configured to run in Google cloud under the App Engine service.
To build the service run: 

```./mvnw clean install```

To deploy the service you need simply to run the command:

``` ./mvnw appengine:deploy```

For more instructions about Google cloud deployment and App Engine, follow the following [link](https://codelabs.developers.google.com/codelabs/cloud-app-engine-springboot#0) 
