def call(String git) {
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
