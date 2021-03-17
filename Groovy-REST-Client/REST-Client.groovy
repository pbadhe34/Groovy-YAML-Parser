 import groovy.json.JsonSlurper

// GET
def get = new URL("http://localhost:8080/Spring-rest-service/person/3").openConnection();
def getRC = get.getResponseCode();
println(getRC);
if(getRC.equals(200)) {    
  res = get.getInputStream().getText()
    
def output = new JsonSlurper().parseText( res )

// Print them out to make sure
//output.each { println it }
println output.id

}
