$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/Features/00_Login.feature");
formatter.feature({
  "name": "Login Feature",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Login Feature",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Login"
    }
  ]
});
formatter.step({
  "name": "I Login to Application as \"\u003cuserId\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "name": "I Logout form Application",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "userId"
      ]
    },
    {
      "cells": [
        "Admin"
      ]
    },
    {
      "cells": [
        "Admin1"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Login Feature",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Smoke"
    },
    {
      "name": "@Login"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I Login to Application as \"Admin\"",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.CommonSteps.i_Login_to_Application_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Logout form Application",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.CommonSteps.i_Logout_form_Application()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Login Feature",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Smoke"
    },
    {
      "name": "@Login"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I Login to Application as \"Admin1\"",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.CommonSteps.i_Login_to_Application_as(java.lang.String)"
});
formatter.result({
  "error_message": "org.openqa.selenium.TimeoutException: Supplied function might have stalled\nBuild info: version: \u00274.0.0-alpha-6\u0027, revision: \u00275f43a29cfc\u0027\nSystem info: host: \u0027WIN10H-K1F9EKP9\u0027, ip: \u0027192.168.0.104\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002711.0.5\u0027\nDriver info: driver.version: unknown\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:221)\r\n\tat PageClasses.CommonMethods.loginToApplicationWithGivenUser(CommonMethods.java:75)\r\n\tat StepDefinitions.CommonSteps.i_Login_to_Application_as(CommonSteps.java:28)\r\n\tat ✽.I Login to Application as \"Admin1\"(file:///C:/Projects/DemoFramework/src/test/java/Features/00_Login.feature:6)\r\nCaused by: java.util.concurrent.TimeoutException\r\n\tat java.base/java.util.concurrent.CompletableFuture.timedGet(CompletableFuture.java:1886)\r\n\tat java.base/java.util.concurrent.CompletableFuture.get(CompletableFuture.java:2021)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:208)\r\n\tat PageClasses.CommonMethods.loginToApplicationWithGivenUser(CommonMethods.java:75)\r\n\tat StepDefinitions.CommonSteps.i_Login_to_Application_as(CommonSteps.java:28)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:566)\r\n\tat io.cucumber.java.Invoker.invoke(Invoker.java:27)\r\n\tat io.cucumber.java.JavaStepDefinition.execute(JavaStepDefinition.java:27)\r\n\tat io.cucumber.core.runner.PickleStepDefinitionMatch.runStep(PickleStepDefinitionMatch.java:63)\r\n\tat io.cucumber.core.runner.TestStep.executeStep(TestStep.java:64)\r\n\tat io.cucumber.core.runner.TestStep.run(TestStep.java:49)\r\n\tat io.cucumber.core.runner.PickleStepTestStep.run(PickleStepTestStep.java:46)\r\n\tat io.cucumber.core.runner.TestCase.run(TestCase.java:51)\r\n\tat io.cucumber.core.runner.Runner.runPickle(Runner.java:67)\r\n\tat io.cucumber.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:149)\r\n\tat io.cucumber.junit.FeatureRunner.runChild(FeatureRunner.java:83)\r\n\tat io.cucumber.junit.FeatureRunner.runChild(FeatureRunner.java:24)\r\n\tat org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)\r\n\tat org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)\r\n\tat org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:413)\r\n\tat io.cucumber.junit.Cucumber.runChild(Cucumber.java:185)\r\n\tat io.cucumber.junit.Cucumber.runChild(Cucumber.java:83)\r\n\tat org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)\r\n\tat org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)\r\n\tat io.cucumber.junit.Cucumber$RunCucumber.evaluate(Cucumber.java:219)\r\n\tat org.junit.internal.runners.statements.RunAfters.evaluate(RunAfters.java:27)\r\n\tat org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:413)\r\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:137)\r\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:115)\r\n\tat org.testng.junit.JUnit4TestRunner.start(JUnit4TestRunner.java:74)\r\n\tat org.testng.junit.JUnit4TestRunner.run(JUnit4TestRunner.java:65)\r\n\tat org.testng.TestRunner$1.run(TestRunner.java:652)\r\n\tat java.base/java.util.ArrayList.forEach(ArrayList.java:1540)\r\n\tat org.testng.TestRunner.runJUnitWorkers(TestRunner.java:843)\r\n\tat org.testng.TestRunner.privateRunJUnit(TestRunner.java:681)\r\n\tat org.testng.TestRunner.run(TestRunner.java:585)\r\n\tat org.testng.SuiteRunner.runTest(SuiteRunner.java:384)\r\n\tat org.testng.SuiteRunner.runSequentially(SuiteRunner.java:378)\r\n\tat org.testng.SuiteRunner.privateRun(SuiteRunner.java:337)\r\n\tat org.testng.SuiteRunner.run(SuiteRunner.java:286)\r\n\tat org.testng.SuiteRunnerWorker.runSuite(SuiteRunnerWorker.java:53)\r\n\tat org.testng.SuiteRunnerWorker.run(SuiteRunnerWorker.java:96)\r\n\tat org.testng.TestNG.runSuitesSequentially(TestNG.java:1187)\r\n\tat org.testng.TestNG.runSuitesLocally(TestNG.java:1109)\r\n\tat org.testng.TestNG.runSuites(TestNG.java:1039)\r\n\tat org.testng.TestNG.run(TestNG.java:1007)\r\n\tat org.apache.maven.surefire.testng.TestNGExecutor.run(TestNGExecutor.java:135)\r\n\tat org.apache.maven.surefire.testng.TestNGDirectoryTestSuite.executeSingleClass(TestNGDirectoryTestSuite.java:112)\r\n\tat org.apache.maven.surefire.testng.TestNGDirectoryTestSuite.execute(TestNGDirectoryTestSuite.java:99)\r\n\tat org.apache.maven.surefire.testng.TestNGProvider.invoke(TestNGProvider.java:146)\r\n\tat org.apache.maven.surefire.booter.ForkedBooter.invokeProviderInSameClassLoader(ForkedBooter.java:384)\r\n\tat org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:345)\r\n\tat org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:126)\r\n\tat org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:418)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "I Logout form Application",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.CommonSteps.i_Logout_form_Application()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "error_message": "org.openqa.selenium.WebDriverException: chrome not reachable\n  (Session info: chrome\u003d84.0.4147.105)\nBuild info: version: \u00274.0.0-alpha-6\u0027, revision: \u00275f43a29cfc\u0027\nSystem info: host: \u0027WIN10H-K1F9EKP9\u0027, ip: \u0027192.168.0.104\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002711.0.5\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 84.0.4147.105, chrome: {chromedriverVersion: 84.0.4147.30 (48b3e868b4cc0..., userDataDir: C:\\Users\\SSEENI~1\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:52399}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 3e90f952b66d295a9c24cd077fc18fd4\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:196)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:129)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:53)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:160)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:582)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:639)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:643)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.getScreenshotAs(RemoteWebDriver.java:303)\r\n\tat StepDefinitions.Hooks.tearDown(Hooks.java:46)\r\n",
  "status": "failed"
});
fformatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/java/Features/02_AssignLeave.feature");
formatter.feature({
  "name": "Assign Leave",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.scenario({
  "name": "Assign Leave",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Smoke"
    },
    {
   formatter.before({
  "status": "passed"
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I Login to Application",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.Coformatter.result({
  "status": "passed"
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Goto Assign Leave Page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitioformatter.result({
  "status": "passed"
});
formatteformatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Assign Leaves",
  "keyword": "And "
});
formatter.match({
  "location": "Stepformatter.result({
  "status": "passed"
});
formatteformatter.result({
  "error_message": "java.lang.AssertionError: expected [] but found [Tests]\r\n\tat org.testng.Assert.fail(Assert.java:97)\r\n\tat org.testng.Assert.assertEqualsImpl(Assert.java:136)\r\n\tat oformatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/java/Features/02_AssignLeave.feature");
formatter.feature({
  "name": "Assign Leave",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.scenario({
  "name": "Assign Leave",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Smoke"
    },
    {
      "name": "@AssignLeave"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I Login to Application",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.CommonSteps.i_Login_to_Application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Goto Assign Leave Page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.AssignLeaveSteps.i_Goto_Assign_Leave_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Assign Leaves",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.AssignLeaveSteps.i_Assign_Leaves()"
});
formatter.result({
  "error_message": "java.lang.AssertionError: expected [] but found [Tests]\r\n\tat org.testng.Assert.fail(Assert.java:97)\r\n\tat org.testng.Assert.assertEqualsImpl(Assert.java:136)\r\n\tat org.testng.Assert.assertEquals(Assert.java:118)\r\n\tat org.testng.Assert.assertEquals(Assert.java:575)\r\n\tat org.testng.Assert.assertEquals(Assert.java:585)\r\n\tat PageClasses.AssignLeavePage.assignLeaves(AssignLeavePage.java:64)\r\n\tat StepDefinitions.AssignLeaveSteps.i_Assign_Leaves(AssignLeaveSteps.java:23)\r\n\tat ✽.I Assign Leaves(file:///C:/Projects/DemoFramework/src/test/java/Features/02_AssignLeave.feature:8)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "I Logout form Application",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.CommonSteps.i_Logout_form_Application()"
});
formatter.result({
  "status": "skipped"
});
formatter.write("this is my failure message");
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
});