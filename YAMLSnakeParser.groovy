 @Grab('org.yaml:snakeyaml:1.17')

import org.yaml.snakeyaml.Yaml

class YAMLSnakeParser{

    

 String parseYmlData(filename){ 
Yaml parser = new Yaml()
def data = parser.load((filename as File).text)

  data.each{println it}
  println data.records.car.name
 
 println data.records.car.record.model.dealer.name
  data
  }
 }
