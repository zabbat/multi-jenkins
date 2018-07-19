#!/usr/bin/env groovy
pipeline {
	agent any
	stages {
		stage('pipeline'){
			steps{
				sh 'running'
			}
		}
	}
}