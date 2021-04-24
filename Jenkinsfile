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
					def server = Artifactory.server "artifactory"
					def buildInfo = Artifactory.newBuildInfo()
					buildInfo.env.capture = true
					buildInfo.env.collect()
					serverId: 'ingenieria_software_parcial2',
					spec: '''{
						  "files": [
							{
							  "pattern": "**/target/**.jar",
							  "target": "ingenieria_software_parcial2/"
							}
						 ]
					}''',
					server.upload spec: uploadSpec, buildInfo: buildInfo
					buildInfo.retention maxBuilds: 10, maxDays: 7, deleteBuildArtifacts: true
					server.publishBuildInfo buildInfo
				)
			}
		}
	}
}
