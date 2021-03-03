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
        lib('github.com/manhnh251995/jenkins-shared-libraries@main')
    }
    environment {
      NDGH = "MANHNH"
    }
    stages {
        stage("Build") {
            steps {
               sh'''
               echo "foo"
               exit 1
               '''
            }
        }
    }
    post {
        always {
            script {
                sendEmail(currentBuild, ['nguyenmanh251995@gmail.com','phongcanhit@gmail.com'])
            }
        }
        success {
            script {
                sendEmail(currentBuild, ['nguyenmanh251995@gmail.com','phongcanhit@gmail.com'])
            }
        }
        failure {
            script {
                sendEmail(currentBuild, ['nguyenmanh251995@gmail.com','phongcanhit@gmail.com'])
            }
        }
    }
}
