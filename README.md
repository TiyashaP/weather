Task
Create the backend API for a weather web app.
The web app should provide the current weather and projected forecast for location provided by an
address as well as geo location coordinates (longitude/latitude).
Please implement a working RESTful API with the technology of your choice, a test to demonstrate
the API (manual or unit test) and an API documentation showing the API routes, requests and

---------------------------------------------------------------------------------------------------------------------------------------------------------------
1.Creating jar with command: execute the following command which result in jar in the target directory
   mvn clean install -U
2.Execute the following command to start the jar:
   java -jar .\target\weather-0.0.1-SNAPSHOT.jar


3.The api docs for the application is available at :[api-docs](http://localhost:8081/swagger-ui/index.html)
get request with latitude and longitude: curl --request GET \
--url 'http://localhost:8081/v1/weather/?aggregateHours=24&location=38.9697%2C-77.385&unitGroup=us&shortColumnNames=true' \
--header 'cache-control: no-cache' \
--header 'postman-token: 637c2cea-ec85-333e-60dd-237b4d22ecbc'

get request with location name: curl --request GET \
--url 'http://localhost:8081/v1/weather/?aggregateHours=24&location=London&unitGroup=us&shortColumnNames=true' \
--header 'cache-control: no-cache' \
--header 'postman-token: 599b22ca-9e70-903e-4803-b9540d8b4c0d'


