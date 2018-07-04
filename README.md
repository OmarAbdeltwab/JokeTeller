# Gradle for Android and Java Final Project

In this project, i created an app with multiple flavors that uses
multiple libraries and Google Cloud Endpoints. The finished app  consists
of four modules. A Java library that provides jokes, a Google Cloud Endpoints
(GCE) project that serves those jokes, an Android Library containing an
activity for displaying jokes, and an Android app that fetches jokes from the
GCE module and passes them to the Android Library for display.

* Added free and paid flavors to an app, and set up build to share code between them
* Factored reusable functionality into a Java library
* Factorde reusable Android functionality into an Android library
* Configured a multi project build to compile your libraries and app
* Usede the Gradle App Engine plugin to deploy a backend
* Configureed an integration test suite that runs against the local App Engine development server
