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
		stage('MAVEN RESOLVER'){
			steps{
				rtMavenDeployer (
					id: 'deployer-unique-id',
					serverId: 'ingenieria_software_parcial2',
					releaseRepo: 'libs-release-local',
					snapshotRepo: 'libs-snapshot-local',
					// By default, 3 threads are used to upload the artifacts to Artifactory. You can override this default by setting:
					threads: 6,
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
