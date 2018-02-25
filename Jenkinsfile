pipeline {
    agent any
    stages {
        stage('Example') {
            steps {
                echo 'Hello World'
            }
        }
        stage('maven clean build') {
            steps {
               sh 'mvn clean package'
            }
        }
    }
    post {
        always {
            echo 'I will always say Hello again! in master branch'
        }
    }
}