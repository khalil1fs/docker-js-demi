// ENV VARIABLE FOR JENKINS: http://localhost:8080/env-vars.html/
pipeline {

  agent any
  environment {
    VERSION = '1.5.1'
  }
  

  stages {
    stage("build") {
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
