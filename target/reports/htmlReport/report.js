$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("demoSiteTest.feature");
formatter.feature({
  "line": 1,
  "name": "demoSiteTest",
  "description": "I want to register to the website\nSo I can use my username and password to login",
  "id": "demositetest",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3882871700,
  "status": "passed"
});
formatter.before({
  "duration": 3050593500,
  "status": "passed"
});
formatter.before({
  "duration": 3076734000,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "register",
  "description": "",
  "id": "demositetest;register",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "I can access the \"http://thedemosite.co.uk/\" website",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I can navigate to the register page",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I type in the following credentials",
  "rows": [
    {
      "cells": [
        "root",
        "root"
      ],
      "line": 9
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I am able to register",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "http://thedemosite.co.uk/",
      "offset": 18
    }
  ],
  "location": "demoSiteTest.i_can_access_the_website(String)"
});
formatter.result({
  "duration": 1074551200,
  "status": "passed"
});
formatter.match({
  "location": "demoSiteTest.i_can_navigate_to_the_register_page()"
});
formatter.result({
  "duration": 331117100,
  "status": "passed"
});
formatter.match({
  "location": "demoSiteTest.i_type_in_the_following_credentials(DataTable)"
});
formatter.result({
  "duration": 452590800,
  "status": "passed"
});
formatter.match({
  "location": "demoSiteTest.i_am_able_to_register()"
});
formatter.result({
  "duration": 26156800,
  "status": "passed"
});
formatter.after({
  "duration": 594445300,
  "status": "passed"
});
formatter.after({
  "duration": 40744000,
  "status": "passed"
});
formatter.after({
  "duration": 23309900,
  "status": "passed"
});
formatter.before({
  "duration": 3030729700,
  "status": "passed"
});
formatter.before({
  "duration": 3021339400,
  "status": "passed"
});
formatter.before({
  "duration": 3007567000,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "login",
  "description": "",
  "id": "demositetest;login",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 14,
  "name": "I can navigate to the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "To login I type in the following credentials",
  "rows": [
    {
      "cells": [
        "root",
        "root"
      ],
      "line": 16
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "I am able to login",
  "keyword": "Then "
});
formatter.match({
  "location": "demoSiteTest.i_can_navigate_to_the_login_page()"
});
formatter.result({
  "duration": 2659781600,
  "status": "passed"
});
formatter.match({
  "location": "demoSiteTest.to_login_i_type_in_the_following_credentials(DataTable)"
});
formatter.result({
  "duration": 457636900,
  "status": "passed"
});
formatter.match({
  "location": "demoSiteTest.i_am_able_to_login()"
});
formatter.result({
  "duration": 27215500,
  "status": "passed"
});
formatter.after({
  "duration": 594088500,
  "status": "passed"
});
formatter.after({
  "duration": 35912000,
  "status": "passed"
});
formatter.after({
  "duration": 24998300,
  "status": "passed"
});
formatter.uri("googleTest.feature");
formatter.feature({
  "line": 1,
  "name": "googleTest",
  "description": "",
  "id": "googletest",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3058536800,
  "status": "passed"
});
formatter.before({
  "duration": 3047000300,
  "status": "passed"
});
formatter.before({
  "duration": 3066269700,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "find kitten images on google",
  "description": "",
  "id": "googletest;find-kitten-images-on-google",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "we can open google",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "the title is equal to \"google\"",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "we search for kitten",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "google will return us images of kittens",
  "keyword": "Then "
});
formatter.match({
  "location": "googleTest.given()"
});
formatter.result({
  "duration": 1529864700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "google",
      "offset": 23
    }
  ],
  "location": "googleTest.the_title_is_equal_to(String)"
});
formatter.result({
  "duration": 109600,
  "status": "passed"
});
formatter.match({
  "location": "googleTest.when()"
});
formatter.result({
  "duration": 1432190100,
  "status": "passed"
});
formatter.match({
  "location": "googleTest.then()"
});
formatter.result({
  "duration": 1848174800,
  "status": "passed"
});
formatter.after({
  "duration": 593848200,
  "status": "passed"
});
formatter.after({
  "duration": 45064900,
  "status": "passed"
});
formatter.after({
  "duration": 53780800,
  "status": "passed"
});
formatter.before({
  "duration": 3043192700,
  "status": "passed"
});
formatter.before({
  "duration": 3036015100,
  "status": "passed"
});
formatter.before({
  "duration": 3008402300,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "find puppy images on google",
  "description": "",
  "id": "googletest;find-puppy-images-on-google",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "we can open google",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "the title is equal to \"google\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "we search for puppies",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "google will return us images of puppies",
  "keyword": "Then "
});
formatter.match({
  "location": "googleTest.given()"
});
formatter.result({
  "duration": 1225781400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "google",
      "offset": 23
    }
  ],
  "location": "googleTest.the_title_is_equal_to(String)"
});
formatter.result({
  "duration": 74700,
  "status": "passed"
});
formatter.match({
  "location": "googleTest.we_search_for_puppies()"
});
formatter.result({
  "duration": 1208889500,
  "status": "passed"
});
formatter.match({
  "location": "googleTest.google_will_return_us_images_of_puppies()"
});
formatter.result({
  "duration": 1306106900,
  "status": "passed"
});
formatter.after({
  "duration": 588930200,
  "status": "passed"
});
formatter.after({
  "duration": 48763900,
  "status": "passed"
});
formatter.after({
  "duration": 41991800,
  "status": "passed"
});
formatter.uri("teaTest.feature");
formatter.feature({
  "line": 1,
  "name": "teaTask",
  "description": "",
  "id": "teatask",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3102185300,
  "status": "passed"
});
formatter.before({
  "duration": 3085128000,
  "status": "passed"
});
formatter.before({
  "duration": 3030127400,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "buy tea",
  "description": "",
  "id": "teatask;buy-tea",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I can open the website",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "the title is equals to \"Welcome\"",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "I check the menu",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I choose the \"Red Tea\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I will buy the tea",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I go to checkout",
  "keyword": "Then "
});
formatter.match({
  "location": "teaTest.i_can_open_the_website()"
});
formatter.result({
  "duration": 13287177500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Welcome",
      "offset": 24
    }
  ],
  "location": "teaTest.the_title_is_equals_to(String)"
});
formatter.result({
  "duration": 4474300,
  "status": "passed"
});
formatter.match({
  "location": "teaTest.i_check_the_menu()"
});
formatter.result({
  "duration": 639883300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Red Tea",
      "offset": 14
    }
  ],
  "location": "teaTest.i_choose_the(String)"
});
formatter.result({
  "duration": 21133100,
  "status": "passed"
});
formatter.match({
  "location": "teaTest.a_choose_which_tea_to_buy()"
});
formatter.result({
  "duration": 10610290000,
  "status": "passed"
});
formatter.match({
  "location": "teaTest.i_go_to_checkout()"
});
formatter.result({
  "duration": 1159282300,
  "status": "passed"
});
formatter.after({
  "duration": 576100200,
  "status": "passed"
});
formatter.after({
  "duration": 47669400,
  "status": "passed"
});
formatter.after({
  "duration": 23399000,
  "status": "passed"
});
});