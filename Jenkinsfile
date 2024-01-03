pipeline {

  agent any

  stages {
    stage("build") {
      steps {
        //sh 'npm install'
        //sh 'npm build'
        echo 'building the app'
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
  
  
    } 
  }

node {
  // groovy script
}
