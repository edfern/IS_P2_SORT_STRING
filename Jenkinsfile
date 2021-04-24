pipeline{
	agent any 
	stages{
		stage('Udpload JFROG'){
			steps{
				rtUpload (
					buildName: JOB_NAME,
					buildNumber: BUILD_NUMBER,
					serverId: 'ingenieria_software_parcial2',
					spec: '''{
						  "files": [
							{
							  "pattern": "target/sort_string-v2.jar",
							  "target": "result/"
							}
						 ]
					}
				)
			}
		}
	}
}
