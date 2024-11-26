plugins {
	java
	id("org.springframework.boot") version "3.4.0"
	id("io.spring.dependency-management") version "1.1.6"
}

group = "com.example"
version = "0.0.1-SNAPSHOT"

java {
	toolchain {
		languageVersion = JavaLanguageVersion.of(17)
	}
}

repositories {
	mavenCentral()
}

dependencies {
	implementation ("org.springframework.boot:spring-boot-starter-data-mongodb") // MongoDB
	implementation ("com.vaadin:vaadin-spring-boot-starter:24.1.0") // Vaadin UI;
	implementation ("org.springframework.boot:spring-boot-starter-web")
	implementation ("org.apache.pdfbox:pdfbox:2.0.29") // PDF yaratish uchun
	implementation("org.springframework.boot:spring-boot-starter")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
	testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.withType<Test> {
	useJUnitPlatform()
}
