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
<img width="5%" title="Java" src="images/logo/Java.svg">
<img width="5%" title="IntelliJ IDEA" src="images/logo/Idea.svg">
<img width="5%" title="GitHub" src="images/logo/GitHub.svg">
<img width="5%" title="JUnit5" src="images/logo/JUnit5.svg">
<img width="5%" title="Gradle" src="images/logo/Gradle.svg">
<img width="5%" title="Selenide" src="images/logo/Selenide.svg">
<img width="5%" title="Selenoid" src="images/logo/Selenoid.svg">
<img width="5%" title="Allure Report" src="images/logo/Allure.svg">
<img width="5%" title="Jenkins" src="images/logo/Jenkins.svg">
<img width="5%" title="Telegram" src="images/logo/Telegram.svg">
<img width="5%" title="Jira" src="images/logo/Jira.svg">
<img width="5%" title="Allure TestOps" src="images/logo/Allure_TO.svg">
<img width="5%" title="Appium" src="images/logo/Appium.svg">
<img width="5%" title="Browserstack" src="images/logo/Browserstack.svg">
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
