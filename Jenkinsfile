pipeline{
	agent any 
	environment {
		MAVEN_HOME = '/usr/share/maven'
	}
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
					// By default, 3 threads are used to upload the artifacts to Artifactory. You can override this default by setting:
					threads: 6,
					// Attach custom properties to the published artifacts:
					properties: ['key1=value1', 'key2=value2']
				)
				rtMavenRun (
					// Tool name from Jenkins configuration.
					tool: MAVEN_HOME,
					pom: 'pom.xml',
					goals: 'clean install',
					// Maven options.
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
