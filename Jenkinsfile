// ENV VARIABLE FOR JENKINS: http://localhost:8080/env-vars.html/
def gv

pipeline {

  agent any
  

  stages {
    stage("init") {
      steps {
        script {
          gv = load "script.groovy"
        }
      }
      }      

    stage("build") {
      steps {
        script {
          gv.build()
        }
      }
    }      

    stage("run") {
      steps {
        script {
          gv.run()
        }
      }
    }      

    
    stage("test") {
      steps {
        script {
          gv.test()
        }
      }
    }      

    
  } 


} 

node {
  // groovy script
}
