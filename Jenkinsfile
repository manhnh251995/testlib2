//@Library('testlib2@main') _

//evenOrOdd(currentBuild.getNumber())
//checkoutgit("https://github.com/manhnh251995/node-hello.git")
pipeline {
  agent any
  libraries {
    lib('https://github.com/manhnh251995/testlib2@main')
  }
  stages {
    stage("Clone git"){
      steps {
        echo "foo"
        checkoutgit("https://github.com/manhnh251995/node-hello.git")
      }
    }
  }
}
