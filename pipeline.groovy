#!/usr/bin/env groovy
pipeline {
	agent any
	options{skipDefaultCheckput()}
	stages {
		stage('pipeline'){
			steps{
				checkout scm
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