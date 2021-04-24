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
							  "pattern": "target/sort_string-v2.jar",
							  "target": "ingenieria_software_parcial2/"
							}
						 ]
					}''',
					buildName: 'HiJFrog',
					buildNumber: '42'
				)
			}
		}
	}
}
