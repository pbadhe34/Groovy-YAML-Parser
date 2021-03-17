import groovy.yaml.YamlSlurper 
//groovy 3.0

reader = new YamlSlurper()
 file = new File("car.yaml")
 
 Object data = reader.parse(file)
 println data.records.car.name
 println data
 println data.records.car.record.model.dealer.name
 
