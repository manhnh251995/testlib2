def call() {

    checkout scm

    def scmVars = [:]

    
    dir('testlib') {

        def repoScmVars = checkout([
            $class: 'GitSCM',
            branches: [[name: "main"]], 
            browser: [$class: 'GithubWeb', repoUrl: 'https://github.com/manhnh251995/node-hello.git'],
           // extensions: [
            //    [$class: 'CleanBeforeCheckout'],
           // ]     
        ])
        //scmVars.put('testlib', repoScmVars)
    }
}

