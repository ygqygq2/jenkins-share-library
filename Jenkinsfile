@Library('jenkins-share-library')

def tools = new org.devops.tools()

pipeline {

  agent any

  stages {
    stage('Example') {
      steps {
        tools.PrintMes("This is my lib")
        }
      }
   }
}