@Library('My-Shared-Lib') _  
node {
     
    stage('YAMLSnakeParser') {        
     echo 'Running groovy code to parse yaml:.'
       sh 'pwd'
echo 'Running groovy code hre yaml:.'
 ymlParser = new com.data.YAMLSnakeParser()


 echo 'Running groovy parser to parse yaml:.'
        result = ymlParser.parseStructure("/home/dell/car.yaml")
     println result
     println result.records

  println result.records.car.record.model.dealer.name
         
    }
    stage('Build') {
         
             
         echo 'Running Build'
    }
     
    
}

