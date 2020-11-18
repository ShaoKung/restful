pipeline {
    agent any

    tools {
        // Install the Maven version configured as "M3" and add it to the path.
        maven "maven3.2.5"
    }

    stages {
        stage('Build') {
            steps {
                // Get some code from a GitHub repository
                git 'https://github.com/ShaoKung/restful.git'
                
                sh  "pwd"
                
                sh "cd /home/admin/.jenkins/workspace/PipeLine"

                // Run Maven on a Unix agent.
                sh  "/home/admin/app/apache-maven-3.2.5/bin/mvn -Dmaven.test.skip=true clean package"

                // To run Maven on a Windows agent, use
                // bat "mvn -Dmaven.test.failure.ignore=true clean package"
            }

            //post {
                // If Maven was able to run the tests, even if some of the test
                // failed, record the test results and archive the jar file.
            //    success {
            //        archiveArtifacts 'target/*.jar'
            //    }
            //}
        }
    }
}
