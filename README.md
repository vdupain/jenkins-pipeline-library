# jenkins-pipeline-library

This git repository contains a library of reusable [Jenkins Pipeline](https://jenkins.io/doc/book/pipeline/) steps and functions that can be used in your `Jenkinsfile` to help improve your Continuous Delivery pipeline.

## How to use

To use the functions in this library just add the following to the top of your `Jenkinsfile`:

```groovy
@Library('github.com/vdupain/jenkins-pipeline-library@master') _
```

That will use the master branch of this library.
