def clone-my-git( git ) {
  pipeline {
    agent any
    stages {
      stage("clone git") {
        steps {
          sh'''
          git clone ${git}
          '''
        }
      }
    }
  }
} 
