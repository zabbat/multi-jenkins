#!/usr/bin/env groovy
pipeline {
	agent any
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
		}
	}
}