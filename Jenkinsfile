pipeline{
	agent any 
	stages{
		stage('Udpload JFROG'){
				environment {
					MAVEN_HOME = '/usr/share/maven'
				}
			steps{
				rtMavenResolver (
					id: 'resolver-unique-id',
					serverId: 'ingenieria_software_parcial2',
					releaseRepo: 'libs-release',
					snapshotRepo: 'libs-snapshot'
				)  
				 
				rtMavenDeployer (
					id: 'deployer-unique-id',
					serverId: 'ingenieria_software_parcial2',
					releaseRepo: 'libs-release-local',
					snapshotRepo: 'libs-snapshot-local',
				)
				rtMavenRun (
					// Tool name from Jenkins configuration.
					pom: 'test-1-parcial2/pom.xml',
					goals: 'clean install',
					resolverId: 'resolver-unique-id',
					deployerId: 'deployer-unique-id',
					buildName: 'my-build-name',
					buildNumber: '17'
				)
			
			}
		}
	}
}
