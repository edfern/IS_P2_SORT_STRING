pipeline{
	agent any 
	stages{
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
					}'''
				)
			}
		}
	}
}
