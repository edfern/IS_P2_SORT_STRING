pipeline{
	agent any 
	stages{
		stage('Server JFROG'){
			steps{
				rtServer (
					id: 'ingenieria_software_parcial2',
					url: 'http://172.18.0.2:8082/artifactory',
					username: 'admin',
					password: 'Fernando1',
					credentialsId: 'ccrreeddeennttiiaall',
					bypassProxy: true,
					timeout: 300
				)
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
							}
						 ]
					}
				)
			}
		}
	}
}
