pipeline{
	agent any 
	stages{
		
		stage('MAVEN RESOLVER'){
			steps{
				rtMavenResolver (
					id: 'resolver-unique-id',
					serverId: 'ingenieria_software_parcial2-1',
					releaseRepo: 'libs-release',
					snapshotRepo: 'libs-snapshot'
				)  
 
				rtMavenDeployer (
					id: 'deployer-unique-id',
					serverId: 'ingenieria_software_parcial2',
					releaseRepo: 'libs-release-local',
					snapshotRepo: 'libs-snapshot-local',
					// By default, 3 threads are used to upload the artifacts to Artifactory. You can override this default by setting:
					threads: 6,
				)
				rtMavenRun (
					maven: 'Maven 3.3.9',
					pom: 'pom.xml',
					goals: 'clean install',
		
					opts: '-Xms1024m -Xmx4096m',
					resolverId: 'resolver-unique-id',
					deployerId: 'deployer-unique-id',
					// If the build name and build number are not set here, the current job name and number will be used:
					buildName: 'my-build-name',
					buildNumber: '17'
				)
			}
		}
		
	}
}
