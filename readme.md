# Shapes

The present code implements the basic requirements of the provided test.
Since no further indications were given regarding the GUI, it was assumed that it would be a mobile-first web application and a REST API was implemented accordingly.

The code can be run with `./gradlew :run` and assumes that a PostgreSQL database is running on the default port 5432 on localhost. The database name is `shapes`, the username is also `shapes` and the password is `postgres`.

The registry-based approach was chosen with extensibility in mind and essentially provides a repository of prototypes.
By creating separate packages for DTOs and Entities, a tier separation was anticipated, but not further enforced due to the simplicity of the use case.
The same is true for the DB schema, the creation of which was now left to Hibernate, a further extension of the project could include introducing a tool like Liquibase.

The next implementation steps would include the creation of a user service to enable admin and user account and replacement of the area computation function with a strategy object to enable the creation of custom shapes.

The API provides the following endpoints:

- /requirements GET   Lists all available shapes and their required parameters
- /shapes       GET   Lists all persisted shapes
- /shape-info   POST  Gets the area and the hierarchy of the shape corresponding to a provided Request object (see below)
- /shapes       POST  Persists a shape with the properties given by the posted Request object (see below)

Both endpoints that can be accessed by means of a POST request expect a Request object of the following form

```
{ "name": ${name_of_shape},
  "parameters": {
      "${parameter_name}": ${double_value}
   ...
   }
}
```
