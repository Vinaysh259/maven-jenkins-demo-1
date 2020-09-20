pipeline{
	agent any
	tools{
		maven 'maven-3.6.3'
		}
		
	stages {
	
		stage('Initialize'){
			steps{
			sh '''
				echo "PATH = ${PATH}"
				echo "M2_HOME = ${M2_HOME}"
				'''
				}
			}
			
		stage('Build'){
			steps {
			sh 'mvn clean package'
			}
			
			post {
				success{
					junit 'target/surefire-reports/**/*.xml'
					}
				}
		 }
	}
}
