#!/usr/bin/env groovy
pipeline {
	agent any
	options{skipDefaultCheckout()}
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