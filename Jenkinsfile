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
					releaseRepo: 'ingenieria_software_parcial2',
					snapshotRepo: 'libs-snapshot'
				)  
				 
				rtMavenDeployer (
					id: 'deployer-unique-id',
					serverId: 'ingenieria_software_parcial2',
					releaseRepo: 'ingenieria_software_parcial2',
					snapshotRepo: 'libs-snapshot-local',
				)
				rtMavenRun (
					// Tool name from Jenkins configuration.
					pom: 'pom.xml',
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
