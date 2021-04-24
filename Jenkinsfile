pipeline{
	agent any 
	stages{
		stage('Run JFrog CLI'){
			steps{
				sh 'pwd'
				sh 'jfrog rt mvn -f'
				sh 'jfrog rt bp'
			}
		}
	}
}
