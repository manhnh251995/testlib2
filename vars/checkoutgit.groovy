def call(str git) {
  pipeline {
    agent any
    stages {
      stage("clone git") {
        steps {
          sh'''
          echo "NLGM"
          '''
        }
      }
    }
  }
} 
