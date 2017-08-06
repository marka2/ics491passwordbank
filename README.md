# Password-Website Bank
##### Created by: Mark Arakaki, Jesus Gonzalez, Blake Larson, & Hendricks Hicks

## Setup: <br />
1. Copy or clone repo files to your localhost <br />
2. Open an IDE, preferrably NetBeans (Please note that Apache Tomcat 8.0 or newer will need to be setup)<br />
3. Open project (ics491-passBank) <br />
4. You will need to add libraries to the project, so extend the project and right-click the library tab and add libraries. <br />
5. Add: Java EE Web 7 API Library, JSF 2.2, Java DB Driver <br />
6. Create the database and table (w/ website, username, and password columns) <br />
7. Add the name of the database and table to the getConnection() function of the code <br />
8. Make sure the connection to the server is turned on <br />
9. Run the program and enjoy! <br />

## Description: <br />
This is the website password bank application for ICS 491 at the University of Hawaii at Manoa. Using Java, we are developing an all in one user-friendly password storage, where people can login with dual authentication (password and security questions). <br />

They will be able to specify websites in which they have accounts on and store their passwords directly into the database. Each user will obviously have different accounts and only be able to get into their own by credential verification. <br />

Users can login or create a new account which will add to our first SQL table with data like a password, security questions, and answers. Next the user is greated by a menu where they can create a new storage for a specific website, or they can delete an existing one on their account. <br />

## Disclaimers/ Caveats: <br />
Currently the program only works for a single user experience. Our goal was to setup the application on a server so multiple people could access their own account and add their own data to tables. Since our original code was a struggle to work around in adding a database setup, we decided to revitalize the entire program. We changed the front-end using html and css rather than Java-Swing. The back-end now allows for a database use and the creation of data touples to insert in the table. We also created a login page that is secure to the single user who is running the application on localhost database, instead of a creation tool for new users. <br />

The username and password is specific to the created database that is connected to the application. The user will need to use these credentials to login. <br />

## What was done this week: <br />

Refactored the code to better suit the needs of a database. Currently have a working login page that runs off of one user, and if the incorrect username or password is used then the user will fail to access further. Once logged in properly, the contents of the table are displayed for the user (ie. website, username, password). If the user would like to add data to their existing database, then they can hit the add button and input information. There are currently security checks in place for the three data pieces, so the user cannot enter any less. <br />

## What is pending: <br />

1. Need to add multiple users for the login rather then one standalone user. <br />
2. We want to add a delete and modify button for each row of data, but need to setup a unique identifier for each. <br />
3. Security questions will need to be implemented to increase security on the user logging in. <br />

## Who did what this week: <br />

Jesus and Blake - Frontend format, color, button, layout <br />
Jesus and Blake - Backend database setup, data display, login page with validation <br />

## Link to GitHub Repository:
https://github.com/marka2/ics491passwordbank

## Link to Github Wiki Page:
https://github.com/marka2/ics491passwordbank/blob/master/README.md
