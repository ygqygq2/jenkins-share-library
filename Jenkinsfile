@Library('jenkins-share-library')

def tools = new org.devops.tools()

pipeline {

  agent any

  stages {
    stage('Example') {
      steps {
        script {
          tools.PrintMsg("This is my lib")
        }
      }
    }
  }
}