@Library('jenkins-share-library')

def tools
tools = new org.devops.tools()

pipeline {

  agent any

  stages {
    stage('Example') {
      steps {
        script {
          tools.colorPrint("red","This is my lib")
        }
      }
    }
  }
}