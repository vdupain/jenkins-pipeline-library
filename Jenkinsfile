@Library('github.com/vdupain/jenkins-pipeline-library@master') _

pipeline {
  agent any
  stages {
    stage('test') {
      steps {
        echo 'hello'
        script {
          def newVersion = getSha1AsVersion()
          echo 'sha1AsVersion=$newVersion'
        }
      }
    }
  }
}
