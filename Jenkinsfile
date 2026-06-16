pipeline {
    agent any

    tools {
        maven 'Maven'
    }

    stages {

        stage('Checkout') {
            steps {
                git branch: 'main',
                url: 'https://github.com/krishnansriram05/Cloud-Cost-Dashboard.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean package -DskipTests'
            }
        }

        stage('Deploy') {
            steps {
                sh '''
                pkill -f cloud-cost-dashboard-1.0.jar || true
                nohup java -jar target/cloud-cost-dashboard-1.0.jar > app.log 2>&1 &
                '''
            }
        }
    }
}
