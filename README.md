# SixtPlatformScriptExecutor

I have created five packages. 

 Model package ==> I have created the VulnerabilityScript class .This is the base domain object .

 ScriptEngine package ==> I have defined a script executor interface for Vulnerability script and  the scripts deriving from our base Vulnerability script. And I also created a class named VulnerabilityScriptExecutor which is implementing the interface I defined . In execute method which takes a Script object as a parameter, I have recursively execute the dependent scripts and main script. For creating the dependent script objects I have used the script factory class which I injected this executor class as an attribute.
 
 ScriptFactory package ==> In this package I have defined an interface where I implied the footprints of create method. And in the concrete class which is implementing this interface I have created the script object.
 
 Util Package ==> In this package, I have created a static method for parsing  the Scripts.txt file to get the dependencies of the given script id. 
 
 Test Package==> In this package, I have tested some cases based on the ids in the Scripts.txt file..You can find the Scripts.txt file in the root of the project. If you run the test class ,you can see the results in the console.
 



