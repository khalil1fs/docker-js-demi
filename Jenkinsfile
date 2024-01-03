pipeline {

  agent any

  stages {
    stage("build") {
      steps {
        //sh 'npm install'
        //sh 'npm build'
        echo 'building the app'
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
  
  
    } 
  }

node {
  // groovy script
}
