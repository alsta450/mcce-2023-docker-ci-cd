#### Readme

This application is a really simple spring boot application that creates a prime number every time the endpoint /prime-numbers/getPrimeNumber is called.

For supply chain security we chose SNYK. Snyk is a security platform that helps developers and organizations identify and remediate vulnerabilities in their open-source dependencies and containerized applications. It integrates with development workflows, offering continuous monitoring, automated remediation suggestions, and policy enforcement to enhance the security of software throughout the development life cycle.

Further we implemented a maven clean install in the build-pipeline to automatically execute all unti tests, and Super Linter to search for code smells in our code. 

From the twelve-factor app we were able to implement the following principles: 

- Port binding by using an integrated Tomcat server to expose our port.
- Processes as we have an stateless application that can run on multiple threads, but share no data.
- Dependencies because all dependencies are packaged using maven and all dependencies are declared in the dependency declaration manifest  (pom.xml)

Finally we created a docker build and a docker push to build and push the Docker image to the repository. 
