pipeline{
	agent any 
	stages{
		stage('Udpload JFROG'){
				environment {
					MAVEN_HOME = '/usr/share/maven'
				}
			steps{
				
				rtMavenDeployer (
					id: 'MAVEN_DEPLOYER',
					serverId: 'artifactory',
					releaseRepo: 'ingenieria_software_parcial2',
					snapshotRepo: 'libs-snapshot-local',
				)
				rtMavenRun (
					// Tool name from Jenkins configuration.
					pom: 'pom.xml',
					goals: 'install',
					deployerId: 'MAVEN_DEPLOYER'
				)
				script{
					sh 'pwd'
				}
			
			}
		}
		stage ('Publish build info') {
            steps {
                rtPublishBuildInfo (
                    serverId: "artifactory"
                )
            }
        }
	}
}
