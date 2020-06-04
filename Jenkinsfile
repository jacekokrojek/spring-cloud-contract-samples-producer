pipeline {
    agent any
    //tools {
    //    maven 'Maven 3.3.9'
    //    jdk 'jdk8'
    //}
    stages {
        stage ('Initialize') {
            steps {
                sh '''
                    echo "PATH = ${PATH}"
                    echo "M2_HOME = ${M2_HOME}"
                '''
            }
        }

        stage ('Build') {
            steps {
                sh 'mvn -Dmaven.test.failure.ignore=true install' 
            }
            post {
                success {
//                    junit 'target/surefire-reports/**/*.xml' 
//					allure([
//						properties: [],
//						reportBuildPolicy: 'ALWAYS',
//						results: [[path: 'target/allure-results']],
//						report: "My Report"
//            	    ])
//					archiveArtifacts artifacts: 'target/allure-results/**/*'
//					archiveArtifacts artifacts: 'target/surefire-reports/**/*'
		    sh 'pwd'
		    sh 'ls -al' 

                }
            }
        }
    }
}