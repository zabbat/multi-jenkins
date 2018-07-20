#!/usr/bin/env groovy
pipeline {
	agent any
	stages {
		stage('pipeline'){
			steps{
				echo 'running'
			}
		}
	}
	post{
		cleanup{
			echo 'cleanup'
		}
	}
}