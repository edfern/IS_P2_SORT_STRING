pipeline{
	agent any 
	stages{
		stage('Maven'){
			steps{
				script{
					sh 'pwd'
					sh 'mvn package'
				}
				echo 'Compilacion finalizada exitosamente'
			}
		}
		stage('Udpload JFROG'){
			steps{
				rtUpload (
					serverId: 'ingenieria_software_parcial2',
					spec: '''{
						  "files": [
							{
							  "pattern": "**/target/**.jar",
							  "target": "ingenieria_software_parcial2/"
							}
						 ]
					}''',
				)
			}
		}
	}
}
