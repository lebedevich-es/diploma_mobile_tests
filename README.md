# Automated tests for mobile app [Wikipedia](https://wikipedia.com)

## :pushpin: Content:

- [Stack of technologies](#computer-stack-of-technologies)
- [Running tests](#running_woman-running-tests)
- [Test cases](#page_facing_up-test-cases)
- [Build in Jenkins](#-build-in-jenkins)
- [Allure report](#-allure-report)
- [Allure TestOps Integration](#-allure-testops-integration)
- [Jira Integration](#-jira-integration)
- [Telegram notifications](#-telegram-notifications)
- [Video of an example of running a test in Selenoid](#-video-of-an-example-of-running-a-test-in-selenoid)


## :computer: Stack of technologies

<p align="center">
<a href="https://www.java.com/"><img width="5%" title="Java" src="images/logo/Java.svg"></a>
<a href="https://www.jetbrains.com/idea/"><img width="5%" title="IntelliJ IDEA" src="images/logo/Idea.svg"></a>
<a href="https://github.com/"><img width="5%" title="GitHub" src="images/logo/GitHub.svg"></a>
<a href="https://junit.org/junit5/"><img width="5%" title="JUnit5" src="images/logo/JUnit5.svg"></a>
<a href="https://gradle.org/"><img width="5%" title="Gradle" src="images/logo/Gradle.svg"></a>
<a href="https://selenide.org/"><img width="5%" title="Selenide" src="images/logo/Selenide.svg"></a>
<a href="https://aerokube.com/selenoid/"><img width="5%" title="Selenoid" src="images/logo/Selenoid.svg"></a>
<a href="https://docs.qameta.io/allure/"><img width="5%" title="Allure Report" src="images/logo/Allure.svg"></a>
<a href="https://www.jenkins.io/"><img width="5%" title="Jenkins" src="images/logo/Jenkins.svg"></a>
<a href="https://web.telegram.org/"><img width="5%" title="Telegram" src="images/logo/Telegram.svg"></a>
<a href="https://www.atlassian.com/ru/software/jira"><img width="5%" title="Jira" src="images/logo/Jira.svg"></a>
<a href="https://qameta.io/"><img width="5%" title="Allure TestOps" src="images/logo/Allure_TO.svg"></a>
<a href="https://appium.io/"><img width="5%" title="Appium" src="images/logo/Appium.svg"></a>
<a href="https://www.browserstack.com/"><img width="5%" title="Browserstack" src="images/logo/Browserstack.svg"></a>
</p>


## :running_woman: Running tests

#### To run tests locally on an Android emulator:

```
gradle clean android_local -DdeviceHost=emulator
```

#### To run tests in the browserstack on Android:

```
gradle clean android -DdeviceHost=android
```

#### To run tests in the browserstack on iOS:

```
gradle clean ios -DdeviceHost=ios
```

### File *auth.properties*
To run tests locally in the browserstack, you need to add the <code>auth.properties</code> file to the resources folder <code>(src/test/resources/)</code>. The following properties must be specified in this file:
```
username=username
accessKey=accessKey
remoteUrl=http://hub.browserstack.com/wd/hub
```


## :page_facing_up: Test cases

#### For Android:
* Successful search
* Open article from Main page
* Open article from Search
#### For iOS:
* Authorization test
#### For Android on emulator:
* Successful onboarding
* Successful search


## <img width="5%" style="vertical-align:middle" title="Jenkins" src="images/logo/Jenkins.svg"> Build in [Jenkins](https://jenkins.autotests.cloud/job/diploma_mobile_lebedevich/)
<p align="center">
<img title="Jenkins Build" src="images/screens/JenkinsBuild.png">

</p>


## <img width="5%" style="vertical-align:middle" title="Allure Report" src="images/logo/Allure.svg"> [Allure](https://jenkins.autotests.cloud/job/diploma_mobile_lebedevich/allure/) report
### Overview

<p align="center">
<img title="Allure Overview" src="images/screens/AllureReport1.png">
</p>

### Test result

<p align="center">
<img title="Test Results in Allure" src="images/screens/AllureReport2.png">
</p>


## <img width="5%" style="vertical-align:middle" title="Allure TestOps Report" src="images/logo/Allure_TO.svg"> [Allure TestOps](https://allure.autotests.cloud/launch/27511) Integration

<p align="center">
<img title="Test Results in Allure" src="images/screens/AllureTestOps.png">
</p>


## <img width="5%" style="vertical-align:middle" title="Jira Integration" src="images/logo/Jira.svg"> [Jira](https://jira.autotests.cloud/browse/HOMEWORK-802) Integration

And also we can see from <code>Jira</code>, which tests been added to <code>Allure</code> with their statuses

<p align="center">
<img title="Allure Overview" src="images/screens/JiraResults.png">
</p>


## <img width="5%" style="vertical-align:middle" title="Telegram" src="images/logo/Telegram.svg"> Telegram notifications

<p align="center">
<img width="50%" title="Telegram Notifications" src="images/screens/telegram.png">
</p>


## <img width="5%" style="vertical-align:middle" title="Selenoid" src="images/logo/Selenoid.svg"> Video of an example of running a test in Selenoid

A video is attached to each test in the report. One of these videos is shown below.
<p align="center">
  <img title="Selenoid Video" src="images/video/video.gif">
</p>
