def call(int buildNumber,git) {
  if (buildNumber % 2 == 0) {
    pipeline {
      agent any
      stages {
        stage("Even Stage") {
          steps {
            echo "The build number is even"
            echo "git"
          }
        }
      }
    }
  } else {
    pipeline {
      agent any
      stages {
        stage("Odd Stage"){
          steps {
            echo "The build number is odd"
            echo "git"
          }
        }
      }
    }
  }
}
