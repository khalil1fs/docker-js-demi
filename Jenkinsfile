CODE_CHANGES = getGitChanges()
pipeline {
  agent any

  stages {
    stage("build") {
    when {
      stage {
        expression {
          BRANCH_NAME == 'dev' && CODE_CHANGES == true
        }
      }
      
    }
      
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
      when {
        expression {
          BRANCH_NAME == 'dev' || BRANCH_NAME == 'master'
        }
      }
    
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

  post {
    always {
      ///
    }
    
    failure {
      
    }

    success {
      
    }
    
  }
  
  }

node {
  // groovy script
}
