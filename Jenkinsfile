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
