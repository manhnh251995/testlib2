//@Library('testlib2@main') _

//evenOrOdd(currentBuild.getNumber())
//checkoutgit("https://github.com/manhnh251995/node-hello.git")
pipeline {
  agent any
  libraries {
    lib('https://github.com/canhnp/testlib@main')
  }
  stages {
    stage("Clone git"){
      steps {
        echo "foo"
        release()
      }
    }
  }
}
