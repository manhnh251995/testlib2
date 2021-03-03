//@Library('testlib2@main') _

//evenOrOdd(currentBuild.getNumber())
//checkoutgit("https://github.com/manhnh251995/node-hello.git")
/*pipeline {
  agent any
  libraries {
    lib('github.com/manhnh251995/testlib2@main')
  }
  stages {
    stage("Clone git"){
      steps {
        echo "foo"
        checkoutgit()
      }
    }
  }
}
*/
pipeline {
    agent any

    libraries {
        lib('github.com/cfpb/jenkins-shared-libraries@main')
    }

    stages {
        stage("Build") {
            steps {
               echo "foo"
            }
        }
    }
    post {
        always {
            script {
                sendEmail(currentBuild, ['nguyenmanh251995@gmail.com'])
            }
        }
        success {
            script {
                sendEmail(currentBuild, ['nguyenmanh251995@gmail.com'])
            }
        }
        failure {
            script {
                sendEmail(currentBuild, ['nguyenmanh251995@gmail.com'])
            }
        }
    }
}
