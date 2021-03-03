def call(git) {
  pipeline {
    agent any
    stages {
      stage('clone-git') {
        steps {
          sh'''
          echo git
          '''
        }
      }
    }
  }
}
