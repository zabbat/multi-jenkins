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
			echo 'cleanup'
			sh 'rm -r source'
		}
	}
}