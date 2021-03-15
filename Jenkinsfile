@Library('My-Shared-Lib') _  
node {
     
    stage('YAMLParser') {        
      echo 'Running grrovy code to parse yaml:.'
       sh 'pwd'
 ymlParser = new com.data.YAMLParser()
        result = ymlParser.parseYmlData("/home/dell/car.yaml")
  println result
         
    }
    stage('Build') {
         
             
         echo 'Running Build'
    }
     
    
}

