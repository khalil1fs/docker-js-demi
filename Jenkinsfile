// ENV VARIABLE FOR JENKINS: http://localhost:8080/env-vars.html/
pipeline {

  agent any
  
  parameters {

    // params.VERSION : to access it
    string(name: 'VERSION', defaultValue: '', description: 'version of prod')
    booleanParam(name: 'executeTests', defaultValue: true, description: '')
  }
  
  tools {
    // the one we define in configuration
    maven 'Maven'
    
  }
  
  
  environment {
    VERSION = '1.5.1'
    SERVER_CREDENTIALS = credentials('admin')
  }
  

  stages {
    stage("build") {
      when {
        expression {
          params.executeTests
        }      
      }
      steps {
        //sh 'npm install'
        //sh 'npm build'
        // Printing an env variable
        echo "building the app ${VERSION}"
      script {
        def test = 2 + 2 > 3 ? 'cool' : 'not cool'
        echo test
      }
      }      
    } 

stage("stage") {
  steps {
echo 'WALO'
    sh "${SERVER_CREDENTIALS}"
  }
}
  
  stage("test") {
      steps {
        echo 'testing the app'
      }      
    }

      stage("deploy") {
      steps {
          echo 'deploying the app'
          withCredentials([
            usernamePassword(credentials: 'admin', usernameVariable: USER, passwordVariable: PWD)
          ]) {
            sh "some script ${USER} ${PWD}"            
          }
        
      }      
    } 

          stage("run frontend") {
      steps {
          echo 'executing yarn...'
          modejs('Node-10.17') {
          sh 'yarn install'
              
          }
      }      
    } 

      stage("run backend") {
      steps {
          echo 'executing gradle...'
          withGradle{} {
          sh './gradlew -v'
              
          }
      }      
    } 

    
    } 
  }

node {
  // groovy script
}
