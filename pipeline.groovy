#!/usr/bin/env groovy
pipeline {
	agent any
	stages {
		stage('pipeline'){
			steps{
				echo 'running'
				sh 'failme'
			}
		}
	}
	post{
		cleanup{
			echo 'cleanup'
		}
	}
}