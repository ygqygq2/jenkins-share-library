@Library('jenkins-share-library')

def tools
tools = new org.devops.tools()

pipeline {

  agent any

  options {
    // 跳过默认设置的代码check out
    skipDefaultCheckout()
    // 流水线超时设置
    timeout(time:1, unit: 'HOURS')
    //保持构建的最大个数
    buildDiscarder(logRotator(numToKeepStr: '20'))
  }

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