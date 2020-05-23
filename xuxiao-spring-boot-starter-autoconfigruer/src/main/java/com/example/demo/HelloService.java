package com.example.demo;

public class HelloService {
	HelloProperties properties;
	
	public HelloProperties getProperties() {
		return properties;
	}

	public void setProperties(HelloProperties properties) {
		this.properties = properties;
	}

	public String sayHello(String name) {
		return properties.getPrefix()+name+"hello"+properties.getSuffix();
	}

}
