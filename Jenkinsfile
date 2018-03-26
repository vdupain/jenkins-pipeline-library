@Library('github.com/vdupain/jenkins-pipeline-library@master') _

pipeline {
  agent any
  stages {
    stage('test') {
      steps {
        echo 'hello'
        script {
          def newVersion = getNewVersion()
          echo 'sha1AsVersion=$newVersion'
        }
      }
    }
  }
}
