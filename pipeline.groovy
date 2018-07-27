#!/usr/bin/env groovy
pipeline {
	agent any
	options{checkoutToSubdirectory('source')}
	stages {
		stage('pipeline'){
			steps{
		
				echo 'running'
				echo 'pass'
			}
		}
	}
	post{
		cleanup{
			script{
				if(env.BRANCH_NAME == 'develop'){
					echo 'done with develop'
				}
			}
			echo 'cleanup'
			sh 'git clean -x -f -d'
		}
	}
}