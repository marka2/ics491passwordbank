# Password-Website Bank
##### Created by: Mark Arakaki, Jesus Gonzalez, Blake Larson, & Hendricks Hicks

## Setup: <br />
1. Copy or clone repo files to your localhost <br />
2. Open an IDE, preferrably NetBeans (Please note that Apache Tomcat 8.0 or newer will need to be setup)<br />
3. Open project (ics491-passBank) <br />
4. You will need to add libraries to the project, so extend the project and right-click the library tab and add libraries. <br />
5. Add: Java EE Web 7 API Library, JSF 2.2, Java DB Driver <br />
6. Run the program and enjoy! <br />

## Description: <br />
This is the website password bank application for ICS 491 at the University of Hawaii at Manoa. Using Java, we are developing an all in one user-friendly password storage, where people can login with dual authentication (password and security questions). <br />

They will be able to specify websites in which they have accounts on and store their passwords directly into the database. Each user will obviously have different accounts and only be able to get into their own by credential verification. <br />

Users can login or create a new account which will add to our first SQL table with data like a password, security questions, and answers. Next the user is greated by a menu where they can create a new storage for a specific website, or they can delete an existing one on their account.

## Front-End: Done <br />
*Week 1:* Java applet using swing classes to create the user-interface. (Mark) <br />

*Week 2:* We have added back buttons and other UI fixes. I terms of what we still have to do, the front-end of the applet is complete and only aesthetic changes will be made from this point forward. (Mark & Blake) <br />

## Back-End: Currently in the works!<br />
*Week 1:* Java SQL classes to connect to our database and create/delete information, security checks (security questions, passwords), creating databases and tables, linking the front-end to the back-end by ways of verifying identity, and adding or removing website data saved on a user's account. (Blake, Jesus, & Hendricks) <br />

*Week 2:* We have successfully linked our database to the login page, but other pages are still not functional in terms of database connectivity. We also need to add the ability to create/delete information in our databases from the applet. After connecting the databases we still need to add our security measures and test them out. (Blake, Jesus, & Hendricks) <br />

*Current Issues:* Trying to establish a full connection to the database once someone is logged in successfully. This includes access throughout each frame of the program. Database is currently localhosted instead of widespread, so setup of the program is a bit tedious and most likely will not work properly when running the login page. A localhost database will need to be created at this time, NetBeans works fast and efficiently. <br />

With the current state and functionality of our code, we may decide to refactor the building blocks to a simple CRUD project using JSF. This will allow seemless use of our database and create <br />

*Currently in the works!*

## What was done this week: <br />

Refactored the code to better suit the needs of a database. Currently have a working login page that runs off of one user, and if the incorrect username or password is used then the user will fail to access further. Once logged in properly, the contents of the table are displayed for the user (ie. website, username, password). If the user would like to add data to their existing database, then they can hit the add button and input information. There are currently security checks in place for the three data pieces, so the user cannot enter any less.

## What is pending: <br />

Need to add multiple users for the login rather then one standalone user. We want to add a delete and modify button for each row of data, but need to setup a unique identifier for each.

## Who did what this week: <br />

Jesus and Blake - Frontend format, color, button, layout
Jesus and Blake - Backend database setup, data display, login page with validation

## Link to GitHub Repository:
https://github.com/marka2/ics491passwordbank
