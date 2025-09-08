pipeline {
    agent any

    stages {
        stage('Compile') {
            steps {
                bat 'javac Helloworld.java'
            }
        }

        stage('Run') {
            steps {
                bat 'java Helloworld'
            }
        }
    }
}
