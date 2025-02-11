<strong> **DO NOT DISTRIBUTE OR PUBLICLY POST SOLUTIONS TO THESE LABS. MAKE ALL FORKS OF THIS REPOSITORY WITH SOLUTION CODE PRIVATE. PLEASE REFER TO THE STUDENT CODE OF CONDUCT AND ETHICAL EXPECTATIONS FOR COLLEGE OF INFORMATION TECHNOLOGY STUDENTS FOR SPECIFICS. ** </strong>

# WESTERN GOVERNORS UNIVERSITY 
## D387 – ADVANCED JAVA
Welcome to Advanced Java! This is an opportunity for students to write multithreaded object-oriented code using Java frameworks and determine how to deploy software applications using cloud services.

FOR SPECIFIC TASK INSTRUCTIONS AND REQUIREMENTS FOR THIS ASSESSMENT, PLEASE REFER TO THE COURSE PAGE.
## BASIC INSTRUCTIONS
For this assessment, you will modify a Spring application with a Java back end and an Angular front end to include multithreaded language translation, a message at different time zones, and currency exchange. Then, build a Docker image of the current multithreaded Spring application and containerize it using the supporting documents provided in this task.


## SUPPLEMENTAL RESOURCES 
1.	How to clone a project to IntelliJ using Git?

> Ensure that you have Git installed on your system and that IntelliJ is installed using [Toolbox](https://www.jetbrains.com/toolbox-app/). Make sure that you are using version 2022.3.2. Once this has been confirmed, click the clone button and use the 'IntelliJ IDEA (HTTPS)' button. This will open IntelliJ with a prompt to clone the proejct. Save it in a safe location for the directory and press clone. IntelliJ will prompt you for your credentials. Enter in your WGU Credentials and the project will be cloned onto your local machine.  

2. How to create a branch and start Development?

- GitLab method
> Press the '+' button located near your branch name. In the dropdown list, press the 'New branch' button. This will allow you to create a name for your branch. Once the branch has been named, you can select 'Create Branch' to push the branch to your repository.

- IntelliJ method
> In IntelliJ, Go to the 'Git' button on the top toolbar. Select the new branch option and create a name for the branch. Make sure checkout branch is selected and press create. You can now add a commit message and push the new branch to the local repo.

## SUPPORT
If you need additional support, please navigate to the course page and reach out to your course instructor.
## FUTURE USE
Take this opportunity to create or add to a simple resume portfolio to highlight and showcase your work for future use in career search, experience, and education!

A.  Create your subgroup and project in GitLab using the provided web link and the "GitLab How-To" web link by doing the following:

- Built Pipeline from GitLab
- Cloned project to Intellij Idea
- Created working_class branch
- Installed Node.js
- installed Angular
- built Angular front end
- served angular front end
- installed Maven(JDK 17 was already installed)
- Ran backend
- Verified full program is running correctly

B.  Modify the Landon Hotel scheduling application for localization and internationalization by doing the following:

    1.   Install the Landon Hotel scheduling application in your integrated development environment (IDE). Modify the Java classes of application to display a welcome message by doing the following:

        a.  Build resource bundles for both English and French (languages required by Canadian law). Include a welcome message in the language resource bundles.

        b.  Display the welcome message in both English and French by applying the resource bundles using a different thread for each language.

            Note: You may use Google Translate for the wording of your welcome message.

- Created en_CA.properties in resources
- Created fr_CA.properties in resources
- Created translate package in edu.wgu.d387_sample_code
- Created WelcomeService.java in translate
- Created WelcomeController.java in translate
- Added WelcomeService method in WelcomeService.java on line 17
- Added run method in WelcomeService.java on line 22
- Added getWelcome method in WelcomeController.java on lines 17-37
- added welcomeMessageEng in app.component.ts on line 18
- added welcomeMessageFr in app.component.ts on line 19
- added get method in app.component.ts on line 37
- Added new div and h1 headers in app.component.html on lines 26-29

    2.  Modify the front end to display the price for a reservation in currency rates for U.S. dollars ($), Canadian dollars (C$), and euros (€) on different lines.

            Note: It is not necessary to convert the values of the prices.

- Added priceCAD and priceEUR variables in app.component.ts on lines 116-117
- Added code to assign price to priceCAD and priceEUR in app.component.ts on lines 65-67
- Added code to display the different currencies in app.component.html on lines 82-83

    3.  Display the time for an online live presentation held at the Landon Hotel by doing the following:

        a.  Write a Java method to convert times between eastern time (ET), mountain time (MT), and coordinated universal time (UTC) zones.

        b.  Use the time zone conversion method from part B3a to display a message stating the time in all three times zones in hours and minutes for an online, live presentation held at the Landon Hotel. The times should be displayed as ET, MT, and UTC.

- Created TimeConversion.java in timezones package
- Created getTimeZones() in TimeConversion.java on lines 10-27
- Created TimeConversionController.java in timezones package
- Added code in TimeConversionController.java on lines 19-31
- Added variable presentationText in app.component.ts on line 20
- Added code in app.component.ts on lines 42-46
- Added 2 breaks in app.component.html on lines 29-30
- Added text in app.component.html on line 31
- Added the {{presentationText}} in app.component.html on line 32
- Fixed code in app.component.ts on lines 42-45
- Had 500 API error: Fixed incorrect Mountain Time ZoneID in TimeConversion.java on line 15

C.  Explain how you would deploy the Spring application with a Java back end and an Angular front end to cloud services and create a Dockerfile using the attached supporting document "How to Create a Docker Account" by doing the following:

    1.  Build the Dockerfile to create a single image that includes all code, including modifications made in parts B1 to B3. Commit and push the final Dockerfile to GitLab.

- Created Dockerfile in root directory
- Clean built maven package
- copied package directory into Dockerfile on line 5
- Changed ENTRYPOINT in dockerfile on line 7

    2.  Test the Dockerfile by doing the following:

        •   Create a Docker image of the current multithreaded Spring application.

        •   Run the Docker image in a container and give the container a name that includes D387_[student ID].

        •   Submit a screenshot capture of the running application with evidence it is running in the container.

    3.  Describe how you would deploy the current multithreaded Spring application to the cloud. Include the name of the cloud service provider you would use.

            Note: Remember to commit and push your changes to GitLab.

D.  Demonstrate professional communication in the content and presentation of your submission.