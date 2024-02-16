# Location Finder App BACKEND
This is the backend of an app that finds a user's location given by a MAC address.
Please also refer to the app itself: https://github.com/eylulguleryuz/Location-Finder-App-

## Technical Information

This project implements the backend of a REST API service that provides the app with data. It uses a SpringBoot as a server. 

### Usage

On the terminal:
```
./gradlew build 
./gradlew bootRun    
```
Once it is builds and starts running, proceed to the app itself and run it. 
Nothing else needs to be done.

## Important Note
Since this project establishes a phpmyadmin remote database connection using a password and username, it can't be cloned and used right away. 
The credentials in src/main/resources/application.properties should be edited according to the needs.
