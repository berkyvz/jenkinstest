pipeline {
    agent any

    stages {
        stage('Clean') {
            steps {
                echo 'Cleaning..'
                sh './gradlew clean'
            }
        }
        stage('Build') {
            steps {
                echo 'Building..'
                sh './gradlew build -x test'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
                sh './gradlew test'
            }
        }
        stage('Cucumber') {
            steps {
                echo 'Cucumber..'
                sh './gradlew cucumber'
            }
        }
        stage('Jococo Test Report') {
		    steps{
		    	echo 'Jacoco Running..'
		   		sh './gradlew jacocoTestReport'
		    }
		}
		stage('SonarQube analysis') {
		    steps{
		    	echo 'SonarQube Analysis Running...'
		   		sh './gradlew sonarqube'
		    }
		}
        stage('Login Docker Hub'){ 
        	steps {
        		echo 'Logging in DockerHub.'
        		sh 'docker login -u $DOCKER_USER -p $DOCKER_PASSWORD'
        	}
        }
        stage('Image Create') {
            steps {
                echo 'Image creating..'
                sh './gradlew jibDockerBuild --image=berkyavuz/jenkinsboot'
            }
        }
        stage('Pushing image to DockerHub'){ 
        	steps {
        		echo 'Pushing to DockerHub.'
        		sh 'docker push $DOCKER_USER/jenkinsboot:latest'
        	}
        }
    }
}